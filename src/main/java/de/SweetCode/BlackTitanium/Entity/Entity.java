package de.SweetCode.BlackTitanium.Entity;

import de.SweetCode.BlackTitanium.Math.Location;
import de.SweetCode.BlackTitanium.Math.Vector2D;

import java.awt.*;

/**
 * Created by Yonas on 03.12.2015.
 */
public abstract class Entity {

    private Location location;
    private Vector2D velocity = new Vector2D(0, 0);

    public Entity(Location location) {
        this.location = location;
    }

    /**
     * Returns the location of the entity.
     * @return
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * Returns the velocity of the entity.
     * @return
     */
    public Vector2D getVelocity() {
        return this.velocity;
    }

    /**
     * Will be called when the entity is about to be updated.
     */
    public abstract void update();

    /**
     * Will be called to render the entity.
     * @param graphics
     */
    public abstract void render(Graphics graphics);

}
