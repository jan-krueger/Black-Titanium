package de.SweetCode.Test;

import de.SweetCode.BlackTitanium.Event.EventListener;
import de.SweetCode.BlackTitanium.Event.EventPriorities;
import de.SweetCode.BlackTitanium.Event.Subscribe;

/**
 * Created by Yonas on 04.12.2015.
 */
public class TestListener implements EventListener {

    @Subscribe(priority = EventPriorities.HIGH)
    public void waitForMessageHigh(TestMessageEvent event) {}

    @Subscribe
    public void waitForMessageNormal(TestMessageEvent event) {}

    @Subscribe(priority = EventPriorities.LOW)
    public void waitForMessageLow(TestMessageEvent event) { }

}


