package testImage.com.september;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Frame extends JFrame{
	
	private String title;
	private JButton buttonStart;
	private JPanel panel = new JPanel();
	
	public Frame(String title) {
		this.title = title;
		
		setTitle(title);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buttonStart = new JButton("Скриншот");

		
		buttonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setLocation(1, 1);
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				GraphicsDevice screen = ge.getDefaultScreenDevice();
				try {
					Robot robot = new Robot(screen);
					robot.delay(1000);
					BufferedImage image = robot.createScreenCapture(new Rectangle(-1, -1, 1280, 900));
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
	
	
}

class ImageFrame extends JFrame{
	private int x = -30, y = -30;
	private JButton btn;
	public ImageFrame(Image image) {
		setTitle("ScreenShot");
		setSize(1270, 900);
		JLabel label = new JLabel(new ImageIcon(image));
		setLocation(x, y);
		add(label);
		btn = new JButton("Вернись, я всё прощу");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setLocation(100, 100);
				
			}
		});
		
	}
}		
		
	