import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class myJFrame  {

    JLabel  topLabel;
    myJFrame(String title) {

        //Create a new JFrame container.
        JFrame jFrame = new JFrame(title);
        //set FlowLayout for layout manager
        jFrame.setLayout(new GridLayout(5,1));
        // set size for jframe
        jFrame.setPreferredSize(new Dimension(200, 200));
        //Terminate the program when the user closes the app
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create components


        ImageIcon fungiImg = new ImageIcon(new ImageIcon("C:\\Users\\Joel\\Desktop\\ButtonImage\\src\\fungi.png").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT));
         topLabel = new JLabel("Push a Button");
         topLabel.setIcon(fungiImg);
         topLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        //add action listeners
         //add components to jframe

        jFrame.add(topLabel,BorderLayout.NORTH);

        jFrame.pack();
        //Display the frame
        jFrame.setVisible(true);
    }


}
