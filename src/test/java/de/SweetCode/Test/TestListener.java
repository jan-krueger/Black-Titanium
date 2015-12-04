package de.SweetCode.Test;

import de.SweetCode.BlackTitanium.Event.EventListener;
import de.SweetCode.BlackTitanium.Event.Subscribe;

/**
 * Created by Yonas on 04.12.2015.
 */
public class TestListener implements EventListener {

    @Subscribe
    public void waitForMessage(TestMessageEvent event) {

        System.out.println("Recieved: " + event.getMessage());

    }

}


