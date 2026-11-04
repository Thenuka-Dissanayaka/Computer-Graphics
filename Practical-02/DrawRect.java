import javax.swing.*;
import java.awt.*;

public class DrawRect extends JFrame{
	public DrawRect(){
		setSize(900, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(12));
		g2.drawRect(50, 50, 300, 250);
		
		g2.setColor(Color.GREEN);
		g2.fillRect(50, 50, 300, 250);
		//g2.drawRect(x, y, width, height);
	}
	
	public static void main (String args []){
		DrawRect frame = new DrawRect();

	}
}
