package iter4_jmenu_bar;

import java.awt.Color;
import java.util.Random;

public class RandomColorStrategy extends ColorStrategy{
    private final Color[] COLORS = {Color.BLACK,
                                    Color.BLUE,
                                    Color.CYAN,
                                    Color.DARK_GRAY,
                                    Color.GRAY,
                                    Color.LIGHT_GRAY,
                                    Color.MAGENTA,
                                    Color.GREEN,
                                    Color.ORANGE,
                                    Color.PINK,
                                    Color.RED,
                                    Color.YELLOW
                                    };
    private Random rand;

    public RandomColorStrategy() {
        rand = new Random();
        colors[0] = COLORS[ rand.nextInt(COLORS.length)];
        colors[1] = COLORS[ rand.nextInt(COLORS.length)];
        colors[2] = COLORS[ rand.nextInt(COLORS.length)];
        colors[3] = COLORS[ rand.nextInt(COLORS.length)];
    }
}
