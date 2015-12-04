package de.SweetCode.BlackTitanium.Map;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yonas on 04.12.2015.
 */
public class MapHandler{

    private List<Map> maps = new ArrayList<>();

    public MapHandler() {}

    private static Map loadMap(String path) {

        BufferedImage bufferedImage = null;

        try {
            bufferedImage = ImageIO.read(MapHandler.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace(); //TODO handle
        }

        return new Map(bufferedImage);

    }

}
