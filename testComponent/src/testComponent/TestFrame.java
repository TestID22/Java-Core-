package testComponent;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame{
	public TestFrame() {
		setSize(500, 500);
		setTitle("meaw");
		TestComp ov = new TestComp();
		add(ov);
		
		
		
	}

	private JPanel buttonPabel;

}
class TestComp extends JComponent{
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		for (int x = 0; x < 10; x += 2)
		g.drawString("Alex ", x, 10);
		
		
	}
}
