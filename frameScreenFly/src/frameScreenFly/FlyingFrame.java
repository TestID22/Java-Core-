package frameScreenFly;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyingFrame extends JFrame{
	private int posX = 100;
	private int posY = 100;
	private boolean  LEFT = false;
	private boolean  RIGHT = true;  
	public FlyingFrame() {
		setSize(100,100);
		setLocation(posX, posY);
		setTitle("Летающее окно");
		JPanel panel = new JPanel();
		JButton btStart = new JButton("Старт");
		ActionListener start = (e) -> {
			while(true) {
				if (posX < 1400) {
					setLocation(posX, posY);
					posX += 1;
				}	
				else if(posX == 1400)
					posX = -100;
					
				
				
			}
		};
		
		btStart.addActionListener(start);
		panel.add(btStart);
		add(panel);
		
				
	}
}
