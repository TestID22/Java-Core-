package com.september.testSkills;
/**
 * Класс Слушатель вешает управление на фрейм
 * 
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener{

	public static boolean [] keys = new boolean[100];
	
	
	public static boolean isKeyPresssed(int keyCode) {
		return keys[keyCode];
	}
	
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		
	}public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}public void keyTyped(KeyEvent e) {
		
		
	}
}
