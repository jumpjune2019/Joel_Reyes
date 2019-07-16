import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gui extends JFrame implements KeyListener {
    MyThread ob1 = new MyThread("1");
    MyThread ob2 = new MyThread("2");
    MyThread ob3 = new MyThread("3");
    MyThread ob4 = new MyThread("4");
    MyThread ob5 = new MyThread("5");

    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press fire button");
    Gui (){
        keyText.addKeyListener(this);
        setSize(100,100);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        //not used
    }

    @Override
    public void keyPressed(KeyEvent e ) {
        //get key code from event
        int keyPressed = e.getKeyCode();
          //1==49 //2==50 //3==51 //4==52  //5==53  //S==83 //T==84 //L==76 // N==78



        if(keyPressed == 49){
            controlThreadOne();
        }else if(keyPressed == 50){
            controlThreadTwo();
        }else if(keyPressed == 51){
            controlThreadThree();
        }else if(keyPressed == 52){
            controlThreadFour();
        }else if(keyPressed == 53){
            controlThreadFive();
        }else if(keyPressed == 83){
            System.out.println(" s is is being pressed do something with it");
        }else if(keyPressed == 54){
            System.out.println(" t is is being pressed do something with it");
        }else if(keyPressed == 76){
            System.out.println(" l is is being pressed do something with it");
        }else if(keyPressed == 78){
            System.out.println(" n is is being pressed do something with it");
        }




    }

    @Override
    public void keyReleased(KeyEvent e) {
        //not used

    }
    public static void main(String [] args){
        int  pressedTrackerOne =0;
        //create the gui
        new Gui();



    }
    public  void controlThreadOne(){

            //gets one's status and takes apropiate action
        if(ThreadStatus.ONE.getCount()== 0){
            ThreadStatus.ONE.setCount(ThreadStatus.ONE.getCount()+1);
            System.out.println("Controling Thread 1");

        }else if(ThreadStatus.ONE.getCount() == 1){
            ThreadStatus.ONE.setCount(ThreadStatus.ONE.getCount()+1);
            ob1.mysuspend();
        }else if(ThreadStatus.ONE.getCount() == 2){
            System.out.println("Resuming thread 1");
            ob1.myresume();
            ThreadStatus.ONE.setCount(0);
        }
    }

    public  void controlThreadTwo(){

        //gets one's status and takes apropiate action
        if(ThreadStatus.TWO.getCount()== 0){
            ThreadStatus.TWO.setCount(ThreadStatus.TWO.getCount()+1);
            System.out.println("Controling Thread 2");

        }else if(ThreadStatus.TWO.getCount() == 1){
            ThreadStatus.TWO.setCount(ThreadStatus.TWO.getCount()+1);
            ob2.mysuspend();
        }else if(ThreadStatus.TWO.getCount() == 2){
            System.out.println("Resuming thread 2");
            ob2.myresume();
            ThreadStatus.TWO.setCount(0);
        }
    }

    public  void controlThreadThree(){

        //gets one's status and takes apropiate action
        if(ThreadStatus.THREE.getCount()== 0){
            ThreadStatus.THREE.setCount(ThreadStatus.THREE.getCount()+1);
            System.out.println("Controling Thread 3");

        }else if(ThreadStatus.THREE.getCount() == 1){
            ThreadStatus.THREE.setCount(ThreadStatus.THREE.getCount()+1);
            ob3.mysuspend();
        }else if(ThreadStatus.THREE.getCount() == 2){
            System.out.println("Resuming thread 3");
            ob3.myresume();
            ThreadStatus.ONE.setCount(0);
        }
    }

    public  void controlThreadFour(){

        //gets one's status and takes apropiate action
        if(ThreadStatus.FOUR.getCount()== 0){
            ThreadStatus.FOUR.setCount(ThreadStatus.FOUR.getCount()+1);
            System.out.println("Controling Thread 4");

        }else if(ThreadStatus.FOUR.getCount() == 1){
            ThreadStatus.FOUR.setCount(ThreadStatus.FOUR.getCount()+1);
            ob4.mysuspend();
        }else if(ThreadStatus.FOUR.getCount() == 2){
            System.out.println("Resuming thread 4");
            ob4.myresume();
            ThreadStatus.FOUR.setCount(0);
        }

    }

    public  void controlThreadFive(){

        //gets one's status and takes apropiate action
        if(ThreadStatus.FIVE.getCount()== 0){
            ThreadStatus.FIVE.setCount(ThreadStatus.FIVE.getCount()+1);
            System.out.println("Controling Thread 5");

        }else if(ThreadStatus.FIVE.getCount() == 1){
            ThreadStatus.FIVE.setCount(ThreadStatus.FIVE.getCount()+1);
            ob5.mysuspend();
        }else if(ThreadStatus.FIVE.getCount() == 2){
            System.out.println("Resuming thread 1");
            ob5.myresume();
            ThreadStatus.FIVE.setCount(0);
        }
    }

}
