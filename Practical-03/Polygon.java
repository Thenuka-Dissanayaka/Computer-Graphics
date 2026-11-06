import javax.swing.*;
import java.awt.*;

public class Polygon extends JFrame{
	public Polygon(){
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
		
		int[] xPoints = {50, 150, 250, 150};
		int[] yPoints = {150, 50, 150, 250};
		
	g2.drawPolygon(xPoints, yPoints, xPoints.length);
	g2.setColor(Color.BLUE);
	g2.fillPolygon(xPoints, yPoints, xPoints.length);
		
	}
	public static void main (String [] args){
		Polygon poly = new Polygon();
	}
}
