package notHelloworld;

import javax.swing.*;
import java.awt.*;

public class NotHelloPanel extends JPanel{
	public void paintComponent(Graphics g) {
		g.drawString("Yoy are a alamo", MESSAGE_X, MESSAGE_Y);
	}
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
}
