package iter4_jmenu_bar;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;

public class MainCanvas extends JPanel {

     private ColorStrategy colorStrategy;

     public MainCanvas(int w, int h, ColorStrategy colorStrategy) {
          setPreferredSize(new Dimension(w, h));
          setLayout(new GridLayout(2, 2));
          this.colorStrategy = colorStrategy;

          add(new Gridcanvas(1, colorStrategy.getColor(0)));
          add(new Gridcanvas(2, colorStrategy.getColor(1)));
          add(new Gridcanvas(3, colorStrategy.getColor(2)));
          add(new Gridcanvas(4, colorStrategy.getColor(3)));
     }

     public MainCanvas(ColorStrategy colorStrategy) {
          this(600, 600, colorStrategy);
     }

     public void setColorStrategy(ColorStrategy colorStrategy) {
          this.colorStrategy = colorStrategy;
          for (int i = 0; i < 4; i++) {
               ((Gridcanvas) getComponent(i)).setColor(colorStrategy.getColor(i));
          }
     }

     /*
      * public void paintComponent(Graphics g) {
      * super.paintComponent(g);
      * g.drawLine(0, 300, 600, 300);
      * g.drawLine(300, 0, 300, 600);
      * g.drawOval(100, 100, 400, 400);
      * }
      */

}
