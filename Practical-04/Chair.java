import javax.swing.*;
import java.awt.*;

public class Chair extends JFrame{
	public Chair(){
		setTitle("Chair - DDA Line");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		g.setColor(Color.ORANGE);
		//back
		drawChair(g,100, 100, 200, 100 );
		drawChair(g,100, 100, 100, 250);
		drawChair(g, 200, 100, 200, 250);
		drawChair(g, 100, 250, 200, 250);
		//seat
		drawChair(g, 100, 250, 175, 350);
		drawChair(g, 175, 350, 275, 350);
		drawChair(g, 200, 250, 275, 350);
		//legs
		drawChair(g, 100, 250, 100, 375);
		drawChair(g, 200, 250, 200, 375);
		drawChair(g, 175, 350, 175, 450);
		drawChair(g, 275, 350, 275, 450);
	}
	private void drawChair(Graphics g, int x1, int y1, int x2, int y2){
		//1. dx, dy
		int dx = x2 - x1;
		int dy = y2 - y1;
		int steps;
		//2. calculate the steps
		if(Math.abs(dx) > Math.abs(dy)){
			steps = Math.abs(dx);
		}else{
			steps = Math.abs(dy);
		}
		//3. increments
		float xIncrement = dx / (float) steps;
		float yIncrement = dy / (float) steps;
		
		//initialize starting point
		float x = x1;
		float y = y1;
		
		for(int i = 0; i <= steps; i++){
			g.drawLine(Math.round(x), Math.round(y),Math.round(x), Math.round(y));
			x += xIncrement;
			y += yIncrement;
		}
	}
	public static void main(String args []){
		new Chair();
	}
}
