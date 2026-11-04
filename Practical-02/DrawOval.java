import javax.swing.*;
import java.awt.*;

public class DrawOval extends JFrame{
	public DrawOval(){
		setSize(900, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(12));
		g2.drawOval(50, 50, 100, 100);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(12));
		g2.drawOval(175, 50, 100, 100);
		
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(12));
		g2.drawOval(300, 50, 100, 100);
		
		g2.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(12));
		g2.drawOval(100, 100, 100, 100);
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(12));
		g2.drawOval(225, 100, 100, 100);
		
		//g2.setColor(Color.GREEN);
		//g2.fillOval(50, 50, 300, 300);
		//g2.drawOval(x, y, width, height);
	}
	
	public static void main (String args []){
		DrawOval frame = new DrawOval();

	}
}
