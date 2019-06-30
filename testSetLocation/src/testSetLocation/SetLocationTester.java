package testSetLocation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JFrame;

import testSetLocation.SizedFrame.DrawRect;

public class SetLocationTester {
	public static void main(String[] args) {
		SizedFrame frame = new SizedFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		DrawRect ov = new DrawRect();
		frame.add(ov);
		Scanner in = new Scanner(System.in);
		System.out.println("Введите заголовок для Вашего Титула");
		
//		String name = in.nextLine();
		
	
	}


		
		
	

}
