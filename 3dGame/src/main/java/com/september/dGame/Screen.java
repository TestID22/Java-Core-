package com.september.dGame;

public class Screen {
	
	private int width;
	private int height;
	public int[] pixels;
	
	public Screen(int width, int height) {
		
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		
	}
	
	public void render() {
		
		for (int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++)
				pixels[20 + 100 * width] = 0x00f7ff;
		}
	}
	
}
