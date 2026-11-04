import javax.swing.*;

public class Frame_OC{
	public static void main (String args[]){
		
		JFrame frame = new JFrame("Open and Close Frame Example");
		
		frame.setSize(600, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLocation(300, 200);
		
		frame.setVisible(true);
	}
}
