package com.september.dGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{
		
	private Thread thread;
	private static boolean running = false;
	
	private BufferStrategy bs;
	//помещаем в память картинку с размерами и Типом int RGB 
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	//в пиксель помешаем растеризованный image, который представляет собой массив цветов для пикселей
	private int[]pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	

	
	public Display() {
			
		 	
	}
	
	public void start() {
		running = true;
		thread = new Thread(this, "Display");//создадим объект потока
		thread.start(); 					//стартуем поток, который запустит метод run и код внутри
	}
	
	public synchronized void stop() {
		try {
			thread.join(); 					//метод джоин  Waits for this thread to die.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//код внутри будет выполнятся потоком "Display"
	public void run() {
		while(running)
		{
			System.out.println("Running...");
			update();
			render();
		}
		
	}
	
	public void update() {
		
	}
	
	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
		return;
		}
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(new Color(0xff1abdeb));
		g.fillRect(0, 0, getWidth(), getHeight());
		
		
		
		g.fillOval(10, 10, 100, 200);
		
		bs.show();
		g.dispose();
	}
	
	
}

