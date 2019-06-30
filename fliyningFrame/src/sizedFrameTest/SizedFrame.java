package sizedFrameTest;

import javax.swing.*;

import java.awt.*;


public class SizedFrame extends JFrame{
	public SizedFrame() {
//		Определение размера окна
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
//		Установка ширины и высоты фрейма
//		и позиционирование с помощью платформы
		
		setSize(100 , 100);
		setLocationByPlatform(true);
		
//		Установик икон
		Image icon = kit.getImage("‪‪D:\\Загрузки\\805.gif");
		setIconImage(icon);
		setTitle("Имя Окна");
		
	} 
	
}
