package notHelloworld;

import javax.swing.*;
import java.awt.*;

public class NotHelloWorldFrame extends JFrame{
	public NotHelloWorldFrame() {
		
		setTitle("NotAHacker");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		NotHelloPanel panel = new NotHelloPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH = 700;
	public static final int DEFAULT_HEIGHT = 500;

}
