package buttonListenerTest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{

	public static void main(String[] args) {
		JFrame frame = getMeFrame("Main");
		JPanel panel = new JPanel();
		JButton bt = new JButton("Make This Window BLACK");
		JButton btRed = new JButton("Make Beauty");
		panel.add(bt);
		panel.add(btRed);
		frame.add(panel);
		btRed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
				
			}
		});
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLACK);
				
			}
		});
		
	
	}
		static JFrame getMeFrame(String title) {
			JFrame frame = new JFrame();
			frame.setTitle(title);
			frame.setBounds(400,200,400,400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			return frame;
		}
}
