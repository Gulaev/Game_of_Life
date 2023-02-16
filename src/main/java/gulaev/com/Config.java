package gulaev.com;

import java.awt.*;
import java.util.ArrayList;

public class Config {
    public static final int SIZE  = 12;
    public static final int WIDTH = 100;
    public static final int HEIGHT = 70;
    public static final int SLEEPMS = 70;

    public static Color getColor (Status status){
        switch (status) {

            default :
            case NONE : return Color.BLACK;
            case BORN : return Color.darkGray;
            case LIVE : return Color.WHITE;
            case DIED : return Color.cyan;

        }
    }
}
