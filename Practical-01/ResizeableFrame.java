import javax.swing.*;

public class ResizeableFrame{
	public static void main (String args []){
		JFrame frame = new JFrame("Frame Resizeable");
		
		frame.setSize(600, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
