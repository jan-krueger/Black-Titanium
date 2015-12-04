package de.SweetCode.BlackTitanium;

import de.SweetCode.BlackTitanium.Event.EventManager;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yonas on 03.12.2015.
 */
public abstract class GameHandler<T> {

    private EventManager eventManager;

    private List<T> data = new ArrayList<T>();

    public GameHandler(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public EventManager getEventManager() {
        return this.eventManager;
    }

    /**
     * Returns the original data set.
     * @return
     */
    public List<T> getData() {
        return this.data;
    }

    /**
     * Will be called when the task updates the game.
     */
    public abstract void update();

    /**
     * Will be called to render the handled data.
     * @param graphics
     */
    public abstract void render(Graphics graphics);

    /**
     * Will be called to add a new data to the data set.
     * @param value The data to add.
     * @param <R> The return type.
     * @return
     */
    public abstract <R> R add(T value);

    /**
     * Will be called to remove data from the data set.
     * @param value The value to remove.
     * @param <R> The return type.
     * @return
     */
    public abstract <R> R remove(T value);

}
