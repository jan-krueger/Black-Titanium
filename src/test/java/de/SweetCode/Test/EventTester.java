package de.SweetCode.Test;

import de.SweetCode.BlackTitanium.Event.EventHandler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yonas on 04.12.2015.
 */
public class EventTester {


    @Test
    public void testEventListener() {

        EventHandler eventHandler = new EventHandler();
        eventHandler.registerListener(new TestListener());

        eventHandler.trigger(new TestMessageEvent("Hello, I'm awesome"), (event, eventHolders) -> {

            Assert.assertEquals(eventHolders.size(), 3);

        });


    }

}
