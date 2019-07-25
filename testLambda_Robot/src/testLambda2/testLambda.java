package testLambda2;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

import javax.swing.JFrame;

public class testLambda {

	public static void main(String[] args) {
		//создаём фрейм в 
		ButtonFrame frame = new ButtonFrame("Жёлтый");
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println(frame.getSizeX());
		System.out.println(frame.getSizeY());
		
		
		
	}

}
