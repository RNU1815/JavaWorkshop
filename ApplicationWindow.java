package iter4_jmenu_bar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class ApplicationWindow implements ActionListener{

    JFrame topCon = new JFrame("Composite in Action");
    MainCanvas canvas;
    ColorStrategy colorStrategy;

    public ApplicationWindow(int w, int h) {
        topCon.setSize(w, h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        topCon.setJMenuBar(menuBar);
        JMenu colorMenu = new JMenu("Color Option");
        menuBar.add(colorMenu);
        JMenuItem defaultColors = new JMenuItem("Default");
        defaultColors.addActionListener(this);
        JMenuItem randomColors = new JMenuItem("Random");
        randomColors.addActionListener(this);
        colorMenu.add(defaultColors);
        colorMenu.add(randomColors);

        colorStrategy = new DefaultColorStrategy();
        canvas = new MainCanvas(w, h, colorStrategy);

        topCon.add(canvas);
        topCon.pack();
        topCon.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Handle the "color strategy"
        if (command.equals("Random")) {
            colorStrategy = new RandomColorStrategy();
        }
        else {
            colorStrategy = new DefaultColorStrategy();
        }

        canvas.setColorStrategy(colorStrategy);
        // canvas = new MainCanvas(canvas.getWidth(), canvas.getHeight(), colorStrategy);
        // topCon.setContentPane(canvas);
        // topCon.revalidate();
        // topCon.repaint();
        //topCon.setVisible(true);
    }

    public ApplicationWindow(){
        this(600, 600);
    }
}