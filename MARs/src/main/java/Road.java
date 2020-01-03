import javax.swing.*;
import java.awt.*;

public class Road extends JPanel {
    Image img = new ImageIcon("D:\\Code_Code_Code\\NFS\\src\\main\\resources\\road.jpg").getImage();

    public void paint(Graphics g){
        g = (Graphics2D) g;
        g.drawImage(img, 0,0, null);
    }
}
