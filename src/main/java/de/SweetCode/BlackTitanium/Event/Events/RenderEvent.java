package de.SweetCode.BlackTitanium.Event.Events;

import de.SweetCode.BlackTitanium.Event.Event;

import java.awt.*;

/**
 * Created by Yonas on 04.12.2015.
 */
public class RenderEvent extends Event {

    private RenderEventTypes renderEventType;
    private Graphics graphics;

    public RenderEvent(RenderEventTypes renderEventType, Graphics graphics) {
        this.renderEventType = renderEventType;
        this.graphics = graphics;
    }

    public RenderEventTypes getRenderEventType() {
        return this.renderEventType;
    }

    public Graphics getGraphics() {
        return this.graphics;
    }

    public enum RenderEventTypes {

        ENTITY

    }

}
