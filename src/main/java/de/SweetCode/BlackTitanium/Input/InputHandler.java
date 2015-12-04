package de.SweetCode.BlackTitanium.Input;

import de.SweetCode.BlackTitanium.Entity.Entities.Player;
import de.SweetCode.BlackTitanium.Entity.EntityHandler;
import de.SweetCode.BlackTitanium.Event.EventManager;
import de.SweetCode.BlackTitanium.Event.Events.PlayerMoveEvent;
import de.SweetCode.BlackTitanium.Math.Location;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Yonas on 04.12.2015.
 */
public class InputHandler implements KeyListener {

    private EntityHandler entityHandler;
    private EventManager eventManager;

    public InputHandler(EntityHandler entityHandler, EventManager eventManager) {
        this.entityHandler = entityHandler;
        this.eventManager = eventManager;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

        this.entityHandler.getData().forEach(entity -> {

            if(entity instanceof Player) {

                switch (e.getKeyCode()) {

                    case KeyEvent.VK_W:
                        entity.getVelocity().setY(-2);
                        break;

                    case KeyEvent.VK_S:
                        entity.getVelocity().setY(2);
                        break;

                    case KeyEvent.VK_A:
                        entity.getVelocity().setX(-2);
                        break;

                    case KeyEvent.VK_D:
                        entity.getVelocity().setX(2);
                        break;
                }

                Location from = entity.getLocation().clone();
                Location to = entity.getLocation().clone();
                to.addX(entity.getVelocity().getX());
                to.addY(entity.getVelocity().getY());

                if(!(from.equals(to))) {

                    PlayerMoveEvent playerMoveEvent = new PlayerMoveEvent((Player) entity, entity.getVelocity(), from, to);
                    this.eventManager.trigger(playerMoveEvent);

                    if(playerMoveEvent.isCancelled()) {
                        entity.getLocation().setX(from.getX());
                        entity.getLocation().setY(from.getY());
                        entity.getVelocity().setX(0);
                        entity.getVelocity().setY(0);
                        return;
                    }


                }

            }

        });

    }

    @Override
    public void keyReleased(KeyEvent e) {

        this.entityHandler.getData().forEach(entity -> {

            if(entity instanceof Player) {

                

            }

        });

    }
}
