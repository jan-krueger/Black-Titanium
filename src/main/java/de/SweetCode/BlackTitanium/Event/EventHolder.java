package de.SweetCode.BlackTitanium.Event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yonas on 04.12.2015.
 */
public class EventHolder implements Comparable<EventHolder> {

    private EventListener eventListener;
    private Method method;
    private Subscribe subscribe;

    public EventHolder(EventListener eventListener, Method method, Subscribe subscribe) {
        this.eventListener = eventListener;
        this.method = method;
        this.subscribe = subscribe;
    }

    public void execute(Event event) {
        try {
            this.method.invoke(this.eventListener, event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public EventPriorities getPriority() {
        return this.subscribe.priority();
    }

    @Override
    public int compareTo(EventHolder o) {

        if(o.getPriority().getValue() == this.getPriority().getValue()) {
            return 0;
        }

        if(o.getPriority().getValue() > this.getPriority().getValue()) {
            return 1;
        }

        return -1;

    }
}
