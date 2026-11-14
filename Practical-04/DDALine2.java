import javax.swing.*;
import java.awt.*;

public class DDALine2 extends JFrame{
	public DDALine2(){
		setTitle("Draw Line using DDALine");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		g.setColor(Color.GREEN);
		drawline(g, 100, 300, 400, 600);
		drawline(g, 200, 200, 600, 200);
	}
	private void drawline(Graphics g, int x1, int y1, int x2, int y2){
		// d(x), d(y)
		int dx = x2 - x1;
		int dy = y2 - y1;
		int steps;
		//steps
		if(Math.abs(dx) > Math.abs(dy)){
			steps = Math.abs(dx);
		}else{
			steps = Math.abs(dy);
		}
		//increment of x, y1
		float xIncrement = dx / (float) steps;
		float yIncrement = dy / (float) steps;
		
		float x = x1;
		float y = y1;
		
		for(int i =0; i <=steps; i++){
			g.fillOval(Math.round(x), Math.round(y), 50, 50);
			x += xIncrement;
			y += yIncrement;
		}
	}
	
	public static void main (String args []){
		new DDALine2();
	}
	
}
