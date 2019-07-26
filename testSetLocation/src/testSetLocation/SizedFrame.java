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
		
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screen = kit.getScreenSize();
		int screenheight = screen.height;
		int screenwidth = screen.width;
		setTitle(name);
		setSize(screenwidth + 10, screenheight + 10);
		
		

		}		
	}


	
	


