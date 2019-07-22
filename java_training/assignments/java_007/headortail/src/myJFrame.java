import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class myJFrame implements ActionListener{
   JButton clickToFlip, reset;
   JLabel showRoll;

    //constructor
    myJFrame(String title){
        //Create a new JFrame container.
       JFrame jFrame = new JFrame(title);
       //set FlowLayout for layout manager
        jFrame.setLayout(new FlowLayout());
        // set size for jframe
        jFrame.setSize(400,400);
        //Terminate the program when the user closes the app
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create buttons
        clickToFlip= new JButton("ClicktoFlip");
        reset=new JButton("Reset");
        showRoll=new JLabel("Wait...");
       // set properties
        showRoll.setPreferredSize(new Dimension(300,50));
        // add action listeners
         clickToFlip.addActionListener(this);
         reset.addActionListener(this);

        //add components to jframe
        jFrame.add(showRoll);
        jFrame.add(clickToFlip);
        jFrame.add(reset);
        //Display the frame
        jFrame.setVisible(true);
    }
  public void dosomething(){}
  public void actionPerformed(ActionEvent actionEvent){
        String action = actionEvent.getActionCommand();
        switch (action){
            case "ClicktoFlip":
                Random random = new Random();
                RandomN randomN;
                HeadTail headTail;

                randomN = ()->random.nextInt(2)+1;
                headTail = (x)->(x==1)?"Head":"Tail";
               int getRandom = randomN.getInt();
                showRoll.setText(headTail.getString(getRandom));
            break;
            case "Reset":
                showRoll.setText("Wait...");
            break;
            default:

                System.out.println("Wait what???!!!!!!");
                break;
        }
  }
}
/*
        RandomN randomN;
        HeadTail headTail;

        randomN = ()->random.nextInt(2)+1;
        headTail = (x)->(x==1)?"Head":"Tail";

        System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
        System.out.println("Press the F key and flip your luck!");

        while(!scanner.next().equalsIgnoreCase("q")){
            getRandom = randomN.getInt();
            getString = headTail.getString(getRandom);

            System.out.println("The coin flip is: "+getString+"!");
            System.out.println("Press the F key to try again, press Q or q to quit");
        }
        scanner.close();
        System.out.println("Thank you for playing");
    */