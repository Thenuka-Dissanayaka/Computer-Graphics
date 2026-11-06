import javax.swing.*;
import java.awt.*;

public class Arc extends JFrame{
	public Arc(){
		setTitle("Arc");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(10));
		
		//g2.drawArc(x, y, width, height, startAngle, ArcAngle);
		g2.drawArc(50, 50, 300, 200, 0, -180);
	}
	
	public static void main (String args []){
		Arc arc = new Arc();
	}
}
