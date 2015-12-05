package de.SweetCode.BlackTitanium.Texture.SpriteSheet;

import java.awt.image.BufferedImage;

/**
 * Created by Yonas on 04.12.2015.
 */
public class SpriteSheetLocation {

    private SpriteSheet spriteSheet;

    private int row;
    private int column;
    private int width;
    private int height;

    public SpriteSheetLocation(SpriteSheet spriteSheet, int row, int column, int width, int height) {

        this.spriteSheet = spriteSheet;
        this.row = row;
        this.column = column;
        this.width = width;
        this.height = height;

    }

    public BufferedImage grabImage() {
        return this.spriteSheet.grabImage(this.column, this.row, this.width, this.height);
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
