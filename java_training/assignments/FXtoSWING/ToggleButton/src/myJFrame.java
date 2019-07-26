import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class myJFrame implements  ItemListener {

    JLabel bottomLabel, topLabel;
    myJFrame(String title) {

        //Create a new JFrame container.
        JFrame jFrame = new JFrame(title);
        //set FlowLayout for layout manager
        jFrame.setLayout(new GridLayout(5,1));
        // set size for jframe
        jFrame.setPreferredSize(new Dimension(300, 200));
        //Terminate the program when the user closes the app
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create components
        bottomLabel = new JLabel("");
        topLabel = new JLabel("Push a Button");

        JToggleButton toggleButton = new JToggleButton("On/Off");

        toggleButton.addItemListener(this);


        //add components to jframe

        jFrame.add(topLabel,BorderLayout.NORTH);
        jFrame.add(toggleButton);
        jFrame.add(bottomLabel);

        jFrame.pack();
        //Display the frame
        jFrame.setVisible(true);
       }


        public void itemStateChanged(ItemEvent itemEvent) {
            int state = itemEvent.getStateChange();
            if (state == ItemEvent.SELECTED) {
                bottomLabel.setText("Button is on");
            } else {
                bottomLabel.setText("Button is off");
            }
        }


}
