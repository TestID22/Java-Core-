package com.september.dGame;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{
	
	private Thread thread;
	private static boolean running = false;
	private JFrame frame;
	
	public Display() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		running = true;
		frame = new JFrame();
		
		thread = new Thread(this, "Display");//создадим объект потока
		thread.start(); 					//стартуем поток, который запустит метод run и код внутри
	}
	
	public void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//код внутри будет выполнятся потоком "Display"
	public void run() {
		while(running)
		{
			System.out.println("Running...");
		}
		
	}
}

