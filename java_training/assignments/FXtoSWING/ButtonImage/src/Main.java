import javax.swing.*;

public class Main {
    public static void main(String[]args){
        //create the frame on the event with dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new myJFrame("Using images with buttons Swuing Version");
            }
        });
    }
}
