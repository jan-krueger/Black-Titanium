package de.SweetCode.BlackTitanium.Math;

import de.SweetCode.BlackTitanium.Entity.Entity;

import java.util.Optional;

/**
 * Created by Yonas on 03.12.2015.
 */
public class Location implements Cloneable {

    private int x;
    private int y;

    public Location(Entity entity) {
        this(entity.getLocation().getX(), entity.getLocation().getY());
    }

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addX(int x) {
        this.x += x;
    }

    public void addY(int y) {
        this.y += y;
    }

    public void subX(int x) {
        this.x -= x;
    }

    public void subY(int y) {
        this.y -= y;
    }


    @Override
    public String toString() {
        return "(X|Y) => (" + x + "| " + y + ")";
    }

    @Override
    public boolean equals(Object o) {

        if(!(o instanceof Location)) {
            return false;
        }

        Location oLocation = (Location) o;

        if(!(oLocation.getX() == this.getX())) {
            return false;
        }

        if(!(oLocation.getY() == this.getY())) {
            return false;
        }

        return true;

    }

    @Override
    public Object clone() {
        return new Location(this.getX(), this.getY());
    }


}
