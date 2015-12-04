package de.SweetCode.BlackTitanium.Event;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Yonas on 04.12.2015.
 */
public class EventManager {

    private Map<Class<? extends Event>, TreeSet<EventHandler>> events = new HashMap<>();
    private List<EventListener> eventListeners = new ArrayList<>();

    public EventManager() {}

    public boolean trigger(Event event) {

        if(!(this.events.containsKey(event.getClass()))) {
            return false;
        }

        for(EventHandler eventHandler : this.events.get(event.getClass())) {

            eventHandler.execute(event);

        }

        return true;

    }

    public boolean registerListener(EventListener listener) {

        if(this.eventListeners.contains(listener)) {
            return false;
        }

        this.eventListeners.add(listener);

        Method[] methods = listener.getClass().getDeclaredMethods();
        for(Method method : methods) {

            Subscribe subscribe = method.getAnnotation(Subscribe.class);

            if(subscribe == null) {
                continue;
            }

            if(!(method.getParameterTypes().length == 1)) {
                continue;
            }

            if(!(method.getReturnType().equals(void.class))) {
                continue;
            }

            if(!(Event.class.isAssignableFrom(method.getParameterTypes()[0]))) {
                continue;
            }

            Class<? extends Event> argument = (Class<? extends Event>) method.getParameterTypes()[0];

            if(!(this.events.containsKey(argument))) {
                this.events.put(argument, new TreeSet<>());
            }

            this.events.get(argument).add(new EventHandler(
                    listener,
                    method,
                    subscribe
            ));

        }

        return true;

    }

}