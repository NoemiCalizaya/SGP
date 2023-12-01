import javax.swing.SwingUtilities;

import controller.MainController;

public class App {
    //Archivo principal
    public static void main(String[] args) throws Exception {
        Runnable run = () -> {
            new MainController();
        };
        SwingUtilities.invokeLater(run);
    }
}
