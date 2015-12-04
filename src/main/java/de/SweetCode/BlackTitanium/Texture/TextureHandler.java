package de.SweetCode.BlackTitanium.Texture;

import de.SweetCode.BlackTitanium.Texture.SpriteSheet.SpriteSheet;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yonas on 03.12.2015.
 */
public class TextureHandler {

    private SpriteSheet entitySheet;

    private Map<TextureType, BufferedImage> textures = new HashMap<>();

    public TextureHandler() {

        this.entitySheet = TextureHandler.loadSpriteSheet("/graphics/spritesheet/entity.png");
        this.setup();

    }

    /**
     * Returns the texture for the given texture type.
     * @param textureType
     * @return
     */
    public BufferedImage getTexture(TextureType textureType) {

        if(!(this.textures.containsKey(textureType))) {
            throw new IllegalArgumentException(String.format("%s is a unknown or not loaded texture type.", textureType.getName()));
        }

        return this.textures.get(textureType);
    }

    private void setup() {

        for(TextureType textureType : TextureTypes.values()) {

            switch(textureType.getSpriteSheetType()) {

                case ENTITY:
                    this.textures.put(
                            textureType,
                            this.entitySheet.grabImage(
                                    textureType.getColumn(),
                                    textureType.getRow(),
                                    textureType.getWidth(),
                                    textureType.getHeight()
                            )
                    );
                    break;

            }

        }

    }

    private static SpriteSheet loadSpriteSheet(String path) {

        BufferedImage bufferedImage = null;

        try {
            bufferedImage = ImageIO.read(TextureHandler.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace(); //TODO handle
        }

        return new SpriteSheet(bufferedImage);

    }

}
