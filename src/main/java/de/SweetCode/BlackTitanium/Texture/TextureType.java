package de.SweetCode.BlackTitanium.Texture;

import de.SweetCode.BlackTitanium.Texture.SpriteSheet.SpriteSheetTypes;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Yonas on 03.12.2015.
 */
public interface TextureType {


    String getName();

    Color getColor();

    BufferedImage getTexture();

    SpriteSheetTypes getSpriteSheetType();

    int getWidth();

    int getHeight();

    int getRow();

    int getColumn();

}
