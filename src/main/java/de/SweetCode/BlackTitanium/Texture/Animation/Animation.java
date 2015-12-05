package de.SweetCode.BlackTitanium.Texture.Animation;

import de.SweetCode.BlackTitanium.Texture.SpriteSheet.SpriteSheetLocation;

import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yonas on 04.12.2015.
 */
public class Animation {

    private Queue<AnimationFrame> frames = new PriorityQueue<>();
    private final List<AnimationFrame> original = new ArrayList<>();

    private AnimationStatus animationStatus = AnimationStatus.STOPPED;

    private Timestamp lastFrame = null;

    public Animation(TimeUnit lengthTimeUnit, int length, SpriteSheetLocation... spriteSheetLocations) {

        for(SpriteSheetLocation entry : spriteSheetLocations) {

            this.original.add(new AnimationFrame(entry.grabImage(), TimeUnit.MILLISECONDS, (lengthTimeUnit.toSeconds(length) / spriteSheetLocations.length)));

        }

        this.frames.clear();
        this.frames.addAll(this.original);

    }

    public void start() {

        if(this.animationStatus == AnimationStatus.STARTED) {
            return;
        }

        if(this.original.isEmpty()) {
            return;
        }

        this.animationStatus = AnimationStatus.STARTED;

    }

    public void stop() {

        if(this.original.isEmpty()) {
            return;
        }

        this.animationStatus = AnimationStatus.STOPPED;

    }

    public void reset() {

        this.stop();
        this.lastFrame = null;
        this.frames.clear();
        this.frames.addAll(this.original);

    }

    public AnimationFrame getAnimationFrame() {
        return this.frames.element();
    }

    public void update() {

        if(this.animationStatus == AnimationStatus.STOPPED) {
            return;
        }

        if(this.lastFrame == null) {

            this.lastFrame = new Timestamp(new Date().getTime());
            return;

        }

        Timestamp current = new Timestamp(new Date().getTime());

        if(current.getTime() - this.lastFrame.getTime() > this.getAnimationFrame().getTimeUnit().toMillis(this.getAnimationFrame().getTimeValue())) {

            AnimationFrame animationFrame = this.frames.poll();

            if(animationFrame == null) {
                this.animationStatus = AnimationStatus.ENDED;
            }

        }

    }

}
