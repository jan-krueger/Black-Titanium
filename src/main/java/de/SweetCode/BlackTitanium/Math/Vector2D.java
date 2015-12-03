package de.SweetCode.BlackTitanium.Math;

/**
 * Created by Yonas on 03.12.2015.
 */
public class Vector2D {

    private int x;
    private int y;
    private int length;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = x;
        this.length = x * x + y * x;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getLength() {
        return this.length;
    }
}
