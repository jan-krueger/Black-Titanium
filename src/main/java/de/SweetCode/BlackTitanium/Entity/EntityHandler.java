package de.SweetCode.BlackTitanium.Entity;

import de.SweetCode.BlackTitanium.Event.EventHandler;
import de.SweetCode.BlackTitanium.Event.Events.EntitySpawnEvent;
import de.SweetCode.BlackTitanium.Event.Events.RenderEvent;
import de.SweetCode.BlackTitanium.GameHandler;

import java.awt.*;

/**
 * Created by Yonas on 03.12.2015.
 */
public class EntityHandler extends GameHandler<Entity> {

    private EventHandler eventHandler;

    public EntityHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    public void update() {

        this.getData().forEach(entity -> {

            //TODO event call
            entity.update();

        });

    }

    @Override
    public void render(Graphics graphics) {

        this.getData().forEach(entity -> {

            RenderEvent renderEvent = new RenderEvent(RenderEvent.RenderEventTypes.ENTITY, graphics);
            this.eventHandler.trigger(renderEvent);

            entity.render(graphics);

        });

    }

    @Override
    public Boolean add(Entity value) {


        EntitySpawnEvent entitySpawnEvent = new EntitySpawnEvent(value);

        this.eventHandler.trigger(entitySpawnEvent);

        if(entitySpawnEvent.isCancelled()) {
            return false;
        }

        return this.getData().add(value);

    }

    @Override
    public Boolean remove(Entity value) {

        //TODO call event
        return this.getData().remove(value);

    }
}
