import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class myJFrame implements ActionListener {
    JButton fungi,dairy,reset;
    JLabel buttonDisplay, topLabel;
    myJFrame(String title) {

        //Create a new JFrame container.
        JFrame jFrame = new JFrame(title);
        //set FlowLayout for layout manager
        jFrame.setLayout(new GridLayout(5,1));
        // set size for jframe
        jFrame.setPreferredSize(new Dimension(300, 500));
        //Terminate the program when the user closes the app
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create components
        fungi=new JButton("fungi");
        dairy= new JButton("dairy");
        reset = new JButton("reset");
        ImageIcon dairyImg = new ImageIcon(new ImageIcon("C:\\Users\\Joel\\Desktop\\ButtonImage\\src\\dairy.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        dairy.setIcon(dairyImg);
        ImageIcon fungiImg = new ImageIcon(new ImageIcon("C:\\Users\\Joel\\Desktop\\ButtonImage\\src\\fungi.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        fungi.setIcon(fungiImg);
        buttonDisplay = new JLabel("");
        topLabel = new JLabel("Push a Button");

        //add action listeners
        fungi.addActionListener(this);
        reset.addActionListener(this);
        dairy.addActionListener(this);
        //add components to jframe

        jFrame.add(topLabel,BorderLayout.NORTH);
        jFrame.add(fungi);
        jFrame.add(dairy);
        jFrame.add(buttonDisplay);
        jFrame.add(reset);

        jFrame.pack();
        //Display the frame
        jFrame.setVisible(true);
       }

    public void actionPerformed(ActionEvent actionEvent) {
        String action = actionEvent.getActionCommand();
       switch (action){
           case "dairy":
               buttonDisplay.setText("dairy");
               break;
           case "fungi":
               buttonDisplay.setText("fungi");
               break;
           case "reset":
               buttonDisplay.setText(" ");
               break;
           default:
               System.out.println(action+" is not an actual action");
               break;
       }

    }
}
