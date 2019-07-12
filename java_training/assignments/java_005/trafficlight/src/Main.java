import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println( "Press Enter at Any time to Stop Lights");
        waitForEnter();
    }
    synchronized static void waitForEnter(){
       Lights semaforo= new Lights("semaforo");
       Scanner scanner = new Scanner(System.in);
       String readString = scanner.nextLine();

        while(readString.equals("")) {


            if (readString.isEmpty()) {
                System.out.println("Traffic Light Simulator is Done!");
                semaforo.mystop();


                break;
            }

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }

        }
    }
}
