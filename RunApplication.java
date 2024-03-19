package iter4_jmenu_bar;

import javax.swing.SwingUtilities;

public class RunApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ApplicationWindow());
    }
}
