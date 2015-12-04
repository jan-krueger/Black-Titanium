package de.SweetCode.BlackTitanium.Event.Events;

import de.SweetCode.BlackTitanium.Entity.Entity;
import de.SweetCode.BlackTitanium.Event.CancellableEvent;

/**
 * Created by Yonas on 04.12.2015.
 */
public class EntitySpawnEvent extends CancellableEvent {

    private Entity entity;

    public EntitySpawnEvent(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return this.entity;
    }

}
