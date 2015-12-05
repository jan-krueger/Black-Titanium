package de.SweetCode.BlackTitanium.Texture.Animation.Animations;

import de.SweetCode.BlackTitanium.Texture.Animation.Animation;
import de.SweetCode.BlackTitanium.Texture.SpriteSheet.SpriteSheet;
import de.SweetCode.BlackTitanium.Texture.SpriteSheet.SpriteSheetLocation;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yonas on 05.12.2015.
 */
public enum AnimationTypes implements AnimationType {

    EXAMPLE {

        @Override
        public String getName() {
            return "Example";
        }

        @Override
        public Animation create(SpriteSheet spriteSheet) {

            Animation animation = new Animation(TimeUnit.SECONDS, 1, new SpriteSheetLocation[]{

                    new SpriteSheetLocation(spriteSheet, 1, 1, 32, 32),
                    new SpriteSheetLocation(spriteSheet, 1, 2, 32, 32),
                    new SpriteSheetLocation(spriteSheet, 1, 3, 32, 32),
                    new SpriteSheetLocation(spriteSheet, 1, 4, 32, 32),
                    new SpriteSheetLocation(spriteSheet, 1, 5, 32, 32),

            });

            return animation;
        }

    }

}
