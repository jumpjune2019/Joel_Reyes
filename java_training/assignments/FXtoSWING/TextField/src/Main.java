import java.awt.event.ActionListener;

// Use a text field.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener {
    JTextField jTextField;
    JButton jButton;
    JLabel topLabel, bottomLabel;

    Main() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Use a Text Field");
        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());
        // Give the frame an initial size.
        jfrm.setSize(240, 120);
        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a text field.
        jTextField = new JTextField(10);
        // Set the action commands for the text field.
        jTextField.setActionCommand("myTF");
        // Create the Reverse button.
        JButton jbtnRev = new JButton("Get Search String");
        // Add action listeners.
        jTextField.addActionListener(this);
        jbtnRev.addActionListener(this);
        // Create the labels.
        topLabel = new JLabel("TextField Demo ");
        bottomLabel = new JLabel("Search String: ");
        // Add the components to the content pane.
        jfrm.add(topLabel);
        jfrm.add(jTextField);
        jfrm.add(jbtnRev);
        jfrm.add(bottomLabel);
        // Display the frame.
        jfrm.setVisible(true);
    }
    // Handle action events.
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        switch(action) {

            case "Get Search String":
                String orgStr = jTextField.getText();



                bottomLabel.setText("Search String: "+orgStr);
                break;

            case "myTF":
                String t = jTextField.getText();
                if(t.isEmpty() || t.isBlank()) {
                    bottomLabel.setText("Shooting blank here buddy!");
                } else {
                    bottomLabel.setText("You pressed ENTER. Text is: " + jTextField.getText());
                }

                break;

            default:
                // will never hit this portion of the code in this demo
                System.out.println("Duh?");
                break;
        }
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }

}
