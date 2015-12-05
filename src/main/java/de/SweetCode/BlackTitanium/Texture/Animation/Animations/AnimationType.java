package de.SweetCode.BlackTitanium.Texture.Animation.Animations;

import de.SweetCode.BlackTitanium.Texture.Animation.Animation;
import de.SweetCode.BlackTitanium.Texture.SpriteSheet.SpriteSheet;

/**
 * Created by Yonas on 05.12.2015.
 */
public interface AnimationType {

    public String getName();

    public Animation create(SpriteSheet spriteSheet);

}
