package de.SweetCode.BlackTitanium;

import de.SweetCode.BlackTitanium.Settings.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Yonas on 03.12.2015.
 */
public class BlackTitanium extends Canvas implements Runnable {

    private final JFrame window = new JFrame(Settings.SCREEN_TITLE.<String>getValue());
    private final Thread thread = new Thread();

    public BlackTitanium() {

        this.setupWindow();

    }


    public void run() {

    }

    private void render() {

        BufferStrategy bufferStrategy = this.getBufferStrategy();

        if(bufferStrategy == null) {
            this.createBufferStrategy(Settings.BUFFER_STRATEGY_BUFFERS.getValue());
            return;
        }

        Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        //game render

        graphics.dispose();
        bufferStrategy.show();

    }

    /**
     * Setups the window.
     */
    private void setupWindow() {

        this.window.setPreferredSize(new Dimension(
                Settings.SCREEN_HEIGHT.<Integer>getValue(),
                Settings.SCREEN_WIDTH.<Integer>getValue()
        ));

        this.window.setMaximumSize(new Dimension(
                Settings.SCREEN_HEIGHT.<Integer>getValue(),
                Settings.SCREEN_WIDTH.<Integer>getValue()
        ));

        this.window.setMinimumSize(new Dimension(
                Settings.SCREEN_HEIGHT.<Integer>getValue(),
                Settings.SCREEN_WIDTH.<Integer>getValue()
        ));

        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setResizable(false);
        this.window.setLocationRelativeTo(null);
        this.window.add(this);

        this.window.setVisible(true);

    }

}
