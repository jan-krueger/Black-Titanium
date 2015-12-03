package de.SweetCode.BlackTitanium.Entity.Entities;

import de.SweetCode.BlackTitanium.Entity.Entity;
import de.SweetCode.BlackTitanium.Math.Location;
import de.SweetCode.BlackTitanium.Texture.TextureTypes;

import java.awt.*;

/**
 * Created by Yonas on 03.12.2015.
 */
public class Player extends Entity {

    public Player(Location location) {
        super(location);
    }

    @Override
    public void update() {

        this.getLocation().addX(
                this.getVelocity().getX()
        );

        this.getLocation().addY(
                this.getLocation().getY()
        );

    }

    @Override
    public void render(Graphics graphics) {

        graphics.drawImage(
                TextureTypes.PLAYER.getTexture(),
                this.getLocation().getX(),
                this.getLocation().getY(),
                64, 64,
                null
        );

    }

}
