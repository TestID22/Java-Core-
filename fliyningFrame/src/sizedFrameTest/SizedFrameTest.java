package sizedFrameTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SizedFrameTest {

	public static void main(String[] args) {
		SizedFrame frame = new SizedFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setBackground(Color.BLACK);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screen = kit.getScreenSize();
		int screenX = screen.height;
		int screenY = screen.width;
		
		boolean move = true;
		while (move) {
		for (int x = 0 ; x < screenX - 100; x++) {
			frame.setLocation(x , 0);
			if (x == 1000 && move) {
				move = false;
			}
		}
	
		}
		
	}
}
