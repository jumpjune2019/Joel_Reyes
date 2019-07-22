import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.awt.event.*;

public class myJFrame implements ActionListener{
   JButton clickToFlip, reset;
   JLabel amRollingMessage,userRults,computerResult,showRoll,playAgainPront;

    //constructor
    myJFrame(String title){
        //Create a new JFrame container.
       JFrame jFrame = new JFrame(title);
       //set FlowLayout for layout manager
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        // set size for jframe
        jFrame.setSize(400,400);
        //Terminate the program when the user closes the app
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create components
        clickToFlip= new JButton("Click to Flip");
        reset=new JButton("Reset");
        showRoll=new JLabel("");
        amRollingMessage=new JLabel("                 ");
        userRults = new JLabel("");
        computerResult=new JLabel("");
        playAgainPront= new JLabel("  ");
       // set properties
        showRoll.setPreferredSize(new Dimension(300,50));
        amRollingMessage.setPreferredSize(new Dimension(300,50));
        userRults.setPreferredSize(new Dimension(300,50));
        computerResult.setPreferredSize(new Dimension(300,50));
        playAgainPront.setPreferredSize(new Dimension(300,50 ));
        // add action listeners
         clickToFlip.addActionListener(this);
         reset.addActionListener(this);

        //add components to jframe
        jFrame.add(amRollingMessage);
        jFrame.add(userRults);
        jFrame.add(computerResult);
        jFrame.add(showRoll);
        jFrame.add(playAgainPront);
        jFrame.add(clickToFlip);
        jFrame.add(reset);
        //Display the frame
        jFrame.setVisible(true);
    }
  public void dosomething(){}
  public void actionPerformed(ActionEvent actionEvent){
        String action = actionEvent.getActionCommand();
        switch (action){
            case "Click to Flip":
                try {
                    rollDice();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "Reset":
                amRollingMessage.setText("");
                userRults.setText("");
                computerResult.setText("");
                showRoll.setText("");
                playAgainPront.setText("");

            break;
            default:

                System.out.println("Wait what???!!!!!!");
                break;
        }
  }
    public static int ramdonGenerator() {
        int face = 1;
        face = (int) (Math.random()*6)+1;
        return face;
    }
    public  void rollDice() throws IOException, InterruptedException {
        //return label vase on two ints
        Label labels =(int one, int two)->{
            String label = "";
            String [][] matrix = {
                    {"Snake Eyes","Australian yo","Little Joe From Kokomo","No field five","Easy six","Six one your'are done"},
                    {"Ace caught a deuce","Ballerina","the fever","Jimmie Hicks","Benny Blue","Easy Eight"},
                    {"Easy four","OJ","Brooklyn Forest","Big Red","Eighter from Decatur","Nina from Pasadena"},
                    {"Little Phoebe","Easy six","Skinny McKinney","Square pair","Railroad nine","Big one on the end"},
                    {"Sixie from Dixie","Skinny Dugan","Easy eight","Jesse James","Puppy paws","yo"},
                    {"The Devil","Easy eight","Lou Brown","Tennessee","Six five no jive","Mignight"}};

            if ((one ==1)&&(two==1)) {
                label = matrix[0][0];
            }
            if ((one ==1)&&(two==2)) {
                label = matrix[0][1];
            }
            if ((one ==1)&&(two==3)) {
                label = matrix[0][2];
            }
            if ((one ==1)&&(two==4)) {
                label = matrix[0][3];
            }
            if ((one ==1)&&(two==5)) {
                label = matrix[0][4];
            }
            if ((one ==1)&&(two==6)) {
                label = matrix[0][5];
            }
            if ((one ==2)&&(two==1)) {
                label = matrix[1][0];
            }
            if ((one ==2)&&(two==2)) {
                label = matrix[1][1];
            }
            if ((one ==2)&&(two==3)) {
                label = matrix[1][2];
            }
            if ((one ==2)&&(two==4)) {
                label = matrix[1][3];
            }
            if ((one ==2)&&(two==5)) {
                label = matrix[1][4];
            }
            if ((one ==2)&&(two==6)) {
                label = matrix[1][5];
            }
            if ((one ==3)&&(two==1)) {
                label = matrix[2][0];
            }
            if ((one ==3)&&(two==2)) {
                label = matrix[2][1];
            }
            if ((one ==3)&&(two==3)) {
                label = matrix[2][2];
            }
            if ((one ==3)&&(two==4)) {
                label = matrix[2][3];
            }
            if ((one ==3)&&(two==5)) {
                label = matrix[2][4];
            }
            if ((one ==3)&&(two==6)) {
                label = matrix[2][5];
            }
            if ((one ==4)&&(two==1)) {
                label = matrix[3][0];
            }
            if ((one ==4)&&(two==2)) {
                label = matrix[3][1];
            }
            if ((one ==4)&&(two==3)) {
                label = matrix[3][2];
            }
            if ((one ==4)&&(two==4)) {
                label = matrix[3][3];
            }
            if ((one ==4)&&(two==5)) {
                label = matrix[3][4];
            }
            if ((one ==4)&&(two==6)) {
                label = matrix[3][5];
            }
            if ((one ==5)&&(two==1)) {
                label = matrix[4][0];
            }
            if ((one ==5)&&(two==2)) {
                label = matrix[4][1];
            }
            if ((one ==5)&&(two==3)) {
                label = matrix[4][2];
            }
            if ((one ==5)&&(two==4)) {
                label = matrix[4][3];
            }
            if ((one ==5)&&(two==5)) {
                label = matrix[4][4];
            }
            if ((one ==5)&&(two==6)) {
                label = matrix[4][5];
            }
            if ((one ==6)&&(two==1)) {
                label = matrix[5][0];
            }
            if ((one ==6)&&(two==2)) {
                label = matrix[5][1];
            }
            if ((one ==6)&&(two==3)) {
                label = matrix[5][2];
            }
            if ((one ==6)&&(two==4)) {
                label = matrix[5][3];
            }
            if ((one ==6)&&(two==5)) {
                label = matrix[5][4];
            }
            if ((one ==6)&&(two==6)) {
                label = matrix[5][5];
            }

            return label;
        };
        String result = "";
        String typeOfWin = "";
        final String COMPUTERLOOSES="You win!!";
        final String COMPUTERLOOSESONTIE="Damn! You win on a Double! What Luck!";
        final String COMPUTERWINSONTIE="Damn! I win on a Double! Ah! I pity you fool!";
        final String COMPUTERTIES="Stalemate! You’re tough, let’s try for a tie-breaker Press any key and ENTER to throw your dice or press (Q or q) to quit";

        int userDiceOne, userDiceTwo, computerDiceOne, computerDiceTwo, userTotal,computerTotal;
        userDiceOne=ramdonGenerator();
        userDiceTwo =ramdonGenerator();
        computerDiceOne =ramdonGenerator();
        computerDiceTwo =ramdonGenerator();
        userTotal =userDiceOne + userDiceTwo;
        computerTotal= computerDiceOne + computerDiceTwo;
        // MAKE OPTION FOR TYPE OF WIN ASSIGN PROPER VARIABLE. 4 TIPES OF IFS STATEMENT WILL RUN FOR EVERY TIPE
        // OF WIN THERE IS TO BE.
        amRollingMessage.setText("Rolling the dice!!");
        userRults.setText("You have rolled a "+ userDiceOne+ " and "+ userDiceTwo+ " the "+ labels.label(userDiceOne,userDiceTwo));
        computerResult.setText("I have rolled a "+ computerDiceOne+ " and "+ computerDiceTwo+ " the "+ labels.label(computerDiceOne,computerDiceTwo));
        if(userTotal>computerTotal) {
            //checking type of win by user
            if (userDiceOne == userDiceTwo) {
                showRoll.setText(COMPUTERLOOSESONTIE);
            }else {
                showRoll.setText(COMPUTERLOOSES);
            }

            //will stop the program from running for 10 to give time to the user
            // to check the results from previous game then keep going.
            java.util.concurrent.TimeUnit.SECONDS.sleep(5);
            playAgainPront.setText("Did you cheat?? Gimme another try, c’mon..");



        }else if (userTotal<computerTotal) {
            if (computerDiceOne == computerDiceTwo) {
                playAgainPront.setText(COMPUTERWINSONTIE);
                //will stop the program from running for 10 to give time to the user
                // to check the results from previous game then keep going.
                java.util.concurrent.TimeUnit.SECONDS.sleep(5);
                playAgainPront.setText("Try again? ");

            }
        }else if(userTotal==computerTotal) {
            playAgainPront.setText(COMPUTERTIES);
            //will stop the program from running for 10 to give time to the user
            // to check the results from previous game then keep going.
            java.util.concurrent.TimeUnit.SECONDS.sleep(5);


        }



    }
}
