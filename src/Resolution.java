import javax.swing.*;
import java.awt.*;

public class Resolution extends JFrame {
    static int width = 800;
    static int height = 600;
    static String[] resolutions = {"800x600", "1024x768", "1200x600", "1280x1024", "1680x1050", "1920x1080"};

    public Resolution() {
        super("Resolution");
    }

    private void initGui() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(Resolution.width, Resolution.height));
        this.setLocation(d.width / 2 - Resolution.width / 2, d.height / 2 - Resolution.height / 2);
        this.getContentPane().setBackground(Color.lightGray);
        this.setResizable(false);
    }

    public static void main(String[] args) {
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        UIManager.put("OptionPane.cancelButtonText", "Отмена");
        UIManager.put("OptionPane.okButtonText", "OK");



        Object result = JOptionPane.showInputDialog(null, "Выбирете разрешение", "Выбор разрешение",
                JOptionPane.PLAIN_MESSAGE, null, resolutions, resolutions[0]);

        if (result != null) {
            if (result.equals("800x600")) {
                width = 800;
                height = 600;
            } else if (result.equals("1024x768")) {
                width = 1024;
                height = 768;
            } else if (result.equals("1200x600")) {
                width = 1200;
                height = 600;
            } else if (result.equals("1280x1024")) {
                width = 1280;
                height = 1024;
            } else if (result.equals("1680x1050")) {
                width = 1680;
                height = 1050;
            } else if (result.equals("1920x1080")) {
                width = 1920;
                height = 1080;
            }
        }

        Resolution frame = new Resolution();
        frame.initGui();
        frame.pack();
        frame.setVisible(true);
    }
}
