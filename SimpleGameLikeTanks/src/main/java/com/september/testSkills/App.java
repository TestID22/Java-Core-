package com.september.testSkills;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
	//константы для окна 
	private static final int  WIDTH = 800;
	private static final int HEIGHT = 800;
	
	
    public static void main( String[] args )
    {
    	//создаём класс Кавнваса - Frame и вешаем поверх фрейма
        Frame frame = new Frame();
        JFrame disp = new JFrame();
        
        //натсройки фрейма
        disp.add(frame);
        disp.setVisible(true);
        disp.setSize(WIDTH, HEIGHT);
        disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disp.setLocationRelativeTo(null);
        disp.setBackground(new Color(0x1010ff10));
        
        //вешаем управляющий класс.Слушатель кнопок
        disp.addKeyListener(new InputHandler());
        
        //запускает поток - Важно не забыть или повесить в констурктор
        frame.startThread();
        
    }
}
