package de.SweetCode.BlackTitanium.Event;

import java.util.Collection;

/**
 * Created by Yonas on 04.12.2015.
 */
public interface EventTriggerCallback {

    void callback(Event event, Collection<EventHolder> eventHolders);

}
