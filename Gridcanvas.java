package iter4_jmenu_bar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Gridcanvas extends JPanel {
    private int id;
    private Color color;

    public Gridcanvas(int id, Color color, int w, int h) {
        setPreferredSize(new Dimension(w, h));
        this.id = id;
        this.color = color;
    }

    public Gridcanvas(int id, Color color) {
        this(id, color, 300, 300);
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.setFont(new Font("Courier", Font.BOLD, 20));

        switch (id) {
            case 1:
                g.drawString("Q1", 25, 25);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 90, 90);
                g.setColor(color);
                g.fillArc(100, 100, 400, 400, 90, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 2:
                g.drawString("Q2", 250, 25);
                g.setColor(Color.BLACK);
                g.drawArc(-200, 100, 400, 400, 0, 90);
                g.setColor(color);
                g.fillArc(-200, 100, 400, 400, 0, 90);
                g.setColor(Color.BLACK);
                g.drawLine(0, 0, 0, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 3:
                g.drawString("Q3", 25, 270);
                g.setColor(Color.BLACK);
                g.drawArc(100, -200, 400, 400, 180, 90);
                g.setColor(color);
                g.fillArc(100, -200, 400, 400, 180, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 0, 300, 0);
                break;
            case 4:
                g.drawString("Q4", 250, 270);
                g.setColor(Color.BLACK);
                g.drawArc(-200, -200, 400, 400, 270, 90);
                g.setColor(color);
                g.fillArc(-200, -200, 400, 400, 270, 90);
                g.setColor(Color.BLACK);
                g.drawLine(0, 0, 0, 300);
                g.drawLine(0, 0, 300, 0);
                break;
            default:
                break;
        }

        g.setColor(color);
    }
}
