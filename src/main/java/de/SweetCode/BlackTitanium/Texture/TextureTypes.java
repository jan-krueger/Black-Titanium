package de.SweetCode.BlackTitanium.Texture;

import de.SweetCode.BlackTitanium.Texture.SpriteSheet.SpriteSheetTypes;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Yonas on 03.12.2015.
 */
public enum TextureTypes implements TextureType {

    PLAYER {

        @Override
        public String getName() {
            return "Player";
        }

        @Override
        public Color getColor() {
            return new Color(255, 0, 0);
        }

        @Override
        public BufferedImage getTexture() {
            return TextureTypes.textureHandler.getTexture(this);
        }

        @Override
        public SpriteSheetTypes getSpriteSheetType() {
            return SpriteSheetTypes.ENTITY;
        }

        @Override
        public int getWidth() {
            return 64;
        }

        @Override
        public int getHeight() {
            return 64;
        }

        @Override
        public int getRow() {
            return 1;
        }

        @Override
        public int getColumn() {
            return 1;
        }

    };

    private static TextureHandler textureHandler = new TextureHandler();

}
