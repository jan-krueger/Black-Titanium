package de.SweetCode.BlackTitanium.Texture.Animation;

import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yonas on 04.12.2015.
 */
public class AnimationFrame {

    private TimeUnit timeUnit;
    private long timeValue;

    private BufferedImage bufferedImage;


    public AnimationFrame(BufferedImage bufferedImage, TimeUnit timeUnit, long timeValue) {

        this.bufferedImage = bufferedImage;
        this.timeUnit = timeUnit;
        this.timeValue = timeValue;

    }

    /**
     *
     * @return
     */
    public TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    /**
     *
     * @return
     */
    public long getTimeValue() {
        return this.timeValue;
    }

    /**
     *
     * @return
     */
    public BufferedImage getBufferedImage() {
        return this.bufferedImage;
    }

}
