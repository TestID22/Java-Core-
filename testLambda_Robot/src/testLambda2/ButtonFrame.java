package testLambda2;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ButtonFrame extends JFrame{
	//панель для кнопок
	JPanel buttonPanel = new JPanel();
	//кнопки
	JButton yellowButton;
	JButton blueButton;
	JButton bloodButtonKiller;
	
	//Тутлкит чекает размер экрана
	Toolkit kit = Toolkit.getDefaultToolkit();
	//Size - измерение
	Dimension size = kit.getScreenSize();
	int sizeY = size.height;
	int sizeX = size.width;
	
	//константы размера фрейма
	final int FRAMEWIDTH = 500;
	final int FRAMEHEIGHT = 500;
	//Объявим переменную для робота
	Robot robot;
	
	public ButtonFrame(String FrameName) {
			//Настройки фрейма
			setTitle(FrameName);
			setSize(FRAMEWIDTH,FRAMEHEIGHT);
			setResizable(false);
			
			//Создаём кнопки
			yellowButton = new JButton("Синий");
			blueButton = new JButton("СинийФон");
			bloodButtonKiller = new JButton("Убийца кнопок");
			
			//Добавим кнопки на панель
			buttonPanel.add(yellowButton);
			buttonPanel.add(blueButton);
			buttonPanel.add(bloodButtonKiller);
			
			
			//Вешаем лямбды на кнопки
			yellowButton.addActionListener(event -> this.setTitle("Синий"));
			blueButton.addActionListener(event -> buttonPanel.setBackground(Color.BLUE));
			//Инициализируем робота внутря лямбды, Робот выбрасывает исключение.
			bloodButtonKiller.addActionListener(event -> {
				try {
					//Возьмём данные с графичечекого оборудования и устройства
					GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
					GraphicsDevice screen = env.getDefaultScreenDevice();
					
					robot = new Robot(screen);
					
					robot.mouseMove(100, 100);
					robot.delay(1000);
					robot.mouseMove(100, 300);
				} catch (AWTException e) {
					e.printStackTrace();
				}
			});
		
			add(buttonPanel);
			
	}
	
	public int getSizeX() {
		return sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}
	
}

