package com.september.testSkills;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Random;

public class Frame extends Canvas implements Runnable{
	
	protected final int  WIDTH = 500;
	private final int HEIGHT = 500;
	
	//Насттройки для нашего потока ,и сам класс Потока
	private boolean running = false;
	private Thread thread;
	
	//Управление нашим отрисованным объектом
	private int ovalX = 0;
	private int ovalY = 0;
	private	final  double SPEED = 0.5;
	
	//Рандом для цветом - ПОФИКСИТЬ
	private Random random;
	
	//Способ хранения буферизации, поместим размеры нашего фрейма 
	BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	
	Graphics g;
	
	public Frame() {
		
	}
	
	//Создали метод флаг running даёт старт потоку + создаём потом, и запускаем его   
	public void startThread() 
	{
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	//очищает память наш поток ждём окончания программы + иссключение которое пробрасывает поток
	public void stop() 
	{
		try 
		{
			thread.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	//переопределённый метод (обязательный) main loop for our game
	public void run()
	{
			while(running) 
			{
				render();
				update();
			}

	}
	
	
	//Разобраться с классом Стратегии Буферов
	//получаем стратегии буферов 
	//создали елемент рисования и через объект графики рисуем фон
	//поверх фона рисуем наш элемент
	//покажем буфера и очистим - этот метод крутится в main loop
	public void render()
	{
		BufferStrategy bs = getBufferStrategy();
		
		if(bs == null) 
		{
			createBufferStrategy(2);
		return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(new Color(0x570f0a));
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(new Color(0x00a367));
		g.fillOval(ovalX, ovalY, 30, 30);
	

		bs.show();
		g.dispose();
		
		
	}
	
	//Метод обновляется в потоке постоянно и слушает нажатие клавиш
	public void update() {
		if(InputHandler.isKeyPresssed(KeyEvent.VK_RIGHT))ovalX ++;
		if(InputHandler.isKeyPresssed(KeyEvent.VK_LEFT))ovalX--;
		if(InputHandler.isKeyPresssed(KeyEvent.VK_UP))ovalY--;
		if(InputHandler.isKeyPresssed(KeyEvent.VK_DOWN))ovalY++;	
	}
	
	
	
	
}
