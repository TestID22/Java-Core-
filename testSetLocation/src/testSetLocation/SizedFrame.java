package testSetLocation;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SizedFrame extends JFrame{
	public static String name;
	public SizedFrame() {
		setLocation(100, 100);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screen = kit.getScreenSize();
		int screenheight = screen.height;
		int screenwidth = screen.width;
		setTitle(name);
		setSize(100, 100);
		setBackground(Color.BLUE);
		DrawRect ov = new DrawRect();
		add(ov);
		for(int x = 0; x < 100; x++) {
			ov.setLocation(x, 100);
		}
		
		
	}
public class DrawRect extends JComponent{
	super.paintComponent(g);
	public DrawRect() {
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(20, 20, 30, 30);
	
		
		}
	}
	
	


