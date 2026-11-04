import javax.swing.*;

public class CenterFrame{
	public static void main (String args []){
		JFrame frame = new JFrame("Frame in Center");
		
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
