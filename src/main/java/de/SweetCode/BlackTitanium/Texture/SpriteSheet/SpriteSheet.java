package de.SweetCode.BlackTitanium.Texture.SpriteSheet;

import java.awt.image.BufferedImage;

/**
 * Created by Yonas on 03.12.2015.
 */
public class SpriteSheet {

    private BufferedImage bufferedImage;

    public SpriteSheet(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    /**
     * Returns the image from the given position.
     * @param column Coloum on the sprite sheet.
     * @param row Row on the sprite sheet.
     * @param width Width of the image.
     * @param height Height of the image.
     * @return
     */
    public BufferedImage grabImage(int column, int row, int width, int height) {
        return this.bufferedImage.getSubimage(
                column * width - width,
                row * height - height,
                width,
                height
        );
    }

}

