package de.SweetCode.BlackTitanium.Settings;

/**
 * Created by Yonas on 03.12.2015.
 */
public interface Setting {

    String getName();

    String getPath();

    <T> T getValue();

}
