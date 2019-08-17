package com.september.dGame;

import javax.swing.JFrame;

/**
 * 
 * 
 */
public class App 
{
	private static final int WIDTH = 600;
	private static final int HEIGHT =  600;
	private static final String TITLE = "Machine";
	

	
    public static void main( String[] args )
    {
        Display display = new Display();
        JFrame frame = new JFrame();
        frame.add(display);
        frame.setTitle(TITLE);
        frame.setVisible(true);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
       
        
        display.start();
    }
}
