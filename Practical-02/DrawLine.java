import javax.swing.*;
import java.awt.*;

public class DrawLine extends JFrame{
	public DrawLine(){
		setSize(900, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(12));
		g2.drawLine(50, 50, 300, 300);
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(12));
		g2.drawLine(50, 50, 300, 300);
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(12));
		g2.drawLine(50, 50, 300, 300);
		//g2.drawLine(x1, y1, x2, y2);
	}
	
	public static void main (String args []){
		DrawLine frame = new DrawLine();

	}

	
}
