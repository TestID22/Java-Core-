package testImage.com.september;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Frame extends JFrame{
	
	private String title;
	private JButton buttonStart;
	private JPanel panel = new JPanel();
	private BufferedImage image;
	
	public Frame(String title) {
		this.title = title;
		
		setTitle(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		buttonStart = new JButton("Нажмите меня, прошу");

		
		buttonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				setLocation(-300, -300);
				
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				GraphicsDevice screen = ge.getDefaultScreenDevice();
				
				try {
					Robot robot = new Robot(screen);
					robot.delay(1000);
					image = robot.createScreenCapture(new Rectangle(0, 0, screenSize.width, screenSize.height - 34));
					ImageFrame imageScren = new ImageFrame(image);
					imageScren.setVisible(true);
					
					
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(buttonStart);
		add(panel);
		pack();
		
	}
//	public void melt() {
//		int[]pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
//		for(int i = 0; i < 100; i++) {
//			pixels[i] = i - 10;
//		}
//	}
	
}

/**
 * 
 * @param Image image 
 *
 */


class ImageFrame extends JFrame{
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
		
	