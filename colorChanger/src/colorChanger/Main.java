package colorChanger;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) {
		
		CreateFrame frame = new CreateFrame();
		JPanel panel = new JPanel();
		JButton bt = new JButton("BLACK");
		
		//анонимные классы использую вместо лямбды
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.CYAN);
				
			}
		});
		panel.add(bt);
		frame.add(panel);
	
	}
}



class CreateFrame extends JFrame{
	
	public CreateFrame() {
		
		setTitle("Main window");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}


	

