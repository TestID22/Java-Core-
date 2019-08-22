package com.september.dGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;


public class Display extends Canvas implements Runnable{
	
	static final long serialVersionUID = 1L;
	
	private static int width = 600;
	private static int height = 600;
		
	private Thread thread;
	private static boolean running = false;
	
	private BufferStrategy bs;
	//помещаем в память картинку с размерами и Типом int RGB 
	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	//в пиксель помешаем растеризованный image, который представляет собой массив цветов для пикселей
	public int[]pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	
	private Screen screen;
	
	
	public Display() {
			
		 	
	}
	
	public void start() {
		running = true;
		thread = new Thread(this, "Display");//создадим объект потока
		thread.start(); 					//стартуем поток, который запустит метод run и код внутри
		
		screen = new Screen(width, height);
		
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
			update();
			render();
		}
		
	}
	
	public void update() {
		
	}
	
	public void render() {
		//создаём БаферСтртеджи из неё будем вытягивать ручками графику
		bs = getBufferStrategy();
		
		if(bs == null) {
			createBufferStrategy(3);
		return;
		}
		Graphics g = bs.getDrawGraphics(); // берём графику из буфера
		
		
		
		screen.render();
		for(int i = 1; i < pixels.length; i++) 
			pixels[i] = screen.pixels[i];
		
		g.setColor(new Color(0xff00ff));
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.drawImage(image, 0, 0 ,getWidth(), getHeight(), null);
	
		
		g.dispose();
		bs.show();
	}
	
	
}

