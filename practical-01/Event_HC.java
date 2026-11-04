import java.awt.event.*;
import javax.swing.*;

public class Event_HC{
	public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("Handle Close Event Example");
        // Set the size of the frame
        frame.setSize(400, 300);

        // Add a Window Listener to handle closing events
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(
                        frame,
                        "Are you sure you want to close the application?",
                        "Confirm Exit",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );

                if (response == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
