package de.SweetCode.Test;

import de.SweetCode.BlackTitanium.Event.Event;

/**
 * Created by Yonas on 04.12.2015.
 */
public class TestMessageEvent extends Event {

    private String message;

    public TestMessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
