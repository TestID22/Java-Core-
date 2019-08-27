package testimageandhandler;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Display extends Canvas implements Runnable{
	
	private Thread thread;
	private static boolean running;
	BufferStrategy bs;
	
	
	
	
	public void start() {
		thread = new Thread(this, "DISP");
		thread.start();
	}
	
	
	@Override
	public void run() {
		while(running) {
			render();
		}
		
	}
	
	public void render(){
		bs = getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(2);
		return;
		}
		Graphics g = bs.getDrawGraphics();
		
		g.fillRect(0, 0, 10, 10);
		g.dispose();
		bs.show();
		
	}
}
