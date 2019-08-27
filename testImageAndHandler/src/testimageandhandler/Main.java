package testimageandhandler;

import javax.swing.JFrame;

public class Main {
	private static final int WIDTH = 500;
	private static final int HEIGHT = 300;

	public static void main(String[] args) {
		Display disp = new Display();
		JFrame frame = new JFrame();
		
		frame.add(disp);
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
