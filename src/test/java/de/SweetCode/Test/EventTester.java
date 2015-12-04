package de.SweetCode.Test;

import de.SweetCode.BlackTitanium.Event.EventManager;
import org.junit.Test;

/**
 * Created by Yonas on 04.12.2015.
 */
public class EventTester {


    @Test
    public void testEventListener() {

        EventManager eventManager = new EventManager();
        eventManager.registerListener(new TestListener());
        eventManager.trigger(new TestMessageEvent("Hello, I'm awesome"));

    }

}
