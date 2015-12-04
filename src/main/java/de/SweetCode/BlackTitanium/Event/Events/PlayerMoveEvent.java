package de.SweetCode.BlackTitanium.Event.Events;

import de.SweetCode.BlackTitanium.Entity.Entities.Player;
import de.SweetCode.BlackTitanium.Event.CancellableEvent;
import de.SweetCode.BlackTitanium.Math.Location;
import de.SweetCode.BlackTitanium.Math.Vector2D;

/**
 * Created by Yonas on 04.12.2015.
 */
public class PlayerMoveEvent extends CancellableEvent {

    private Player player;

    private Vector2D velocity;

    private Location from;
    private Location to;

    public PlayerMoveEvent(Player player, Vector2D velocity, Location from, Location to) {

        this.player = player;
        this.velocity = velocity;
        this.from = from;
        this.to = to;

    }

    public Player getPlayer() {
        return this.player;
    }

    public Location getFrom() {
        return this.from;
    }

    public Location getTo() {
        return this.to;
    }

    public Vector2D getVelocity() {
        return this.velocity;
    }

}
