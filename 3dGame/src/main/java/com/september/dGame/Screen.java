package com.september.dGame;

import java.util.Random;

public class Screen {
	
	private int width;
	private int height;
	public int[] pixels;
	private static final Random random = new Random();
	
	public Screen(int width, int height) {
		
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		
	}
	
	public void render() {
		
		for (int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++)
				pixels[x + (y * width)] = random.nextInt(0xffffff);
		}
	}
	
}
