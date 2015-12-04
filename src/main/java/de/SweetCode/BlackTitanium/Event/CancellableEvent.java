package de.SweetCode.BlackTitanium.Event;

/**
 * Created by Yonas on 04.12.2015.
 */
public class CancellableEvent extends Event {

    private boolean cancelled = false;

    public CancellableEvent() {}

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

}
