package testImage.com.september;

import javax.swing.*;
import java.awt.*;

class ImageFrame extends JFrame {
    private final int x = -10, y = -32; //Переменные для setLocale
    private JButton btn;

    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;

    public ImageFrame(Image image) {

        setTitle("ScreenShot");
        setSize(screenSize.width + 200, screenSize.height);

        JLabel label = new JLabel(new ImageIcon(image));

        setLocation(x, y);
        add(label);

        setVisible(true);
    }
}