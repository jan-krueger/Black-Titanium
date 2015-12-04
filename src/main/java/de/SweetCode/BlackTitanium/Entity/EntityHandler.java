package de.SweetCode.BlackTitanium.Entity;

import de.SweetCode.BlackTitanium.Event.EventHandler;
import de.SweetCode.BlackTitanium.Event.EventManager;
import de.SweetCode.BlackTitanium.Event.Events.EntitySpawnEvent;
import de.SweetCode.BlackTitanium.GameHandler;

import java.awt.*;

/**
 * Created by Yonas on 03.12.2015.
 */
public class EntityHandler extends GameHandler<Entity> {

    public EntityHandler(EventManager eventManager) {
        super(eventManager);
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

            //TODO event call
            entity.render(graphics);

        });

    }

    @Override
    public Boolean add(Entity value) {


        EntitySpawnEvent entitySpawnEvent = new EntitySpawnEvent(value);

        this.getEventManager().trigger(entitySpawnEvent);

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
