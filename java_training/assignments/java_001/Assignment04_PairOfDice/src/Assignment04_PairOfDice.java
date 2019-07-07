import java.io.IOException;

public class Assignment04_PairOfDice  {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
			letsPlay();
	}
	public static int ramdonGenerator() {
		int face = 1;
		face = (int) (Math.random()*6)+1;
		return face;
	}
	
	// printing die
	public static void printDie() {
		int dieOne = ramdonGenerator();
		int dieTwo = ramdonGenerator();
		System.out.println("You have rolled the following:  ");
		System.out.println("First Die: "+ dieOne+"\n"+
						   "Second Die: "+ dieTwo	
				);
	}
	public static void letsPlay() throws IOException {
		char key;
		
		System.out.print("Press any key to throw a pair of dice and press Enter (or Q and Enter to quit):");
		// Read a character from the keyboard.
		key = (char) System.in.read(); // get a char
		if (key == 'Q') {
			System.out.println("thansk for not playing");
		}else {
			printDie();
		}
		letsPlayAgain();
		
	}
	public static void letsPlayAgain() throws IOException {
		char key;
		System.out.print("Play Again? (Y or y) and Enter, any other key and Enter to Quit: ");
		// Read a character from the keyboard.
		System.in.skip(System.in.available());
		key = (char) System.in.read(); // get a char
		
		if ((key =='y')||(key =='Y')) {
			printDie();
			
			letsPlayAgain();
		}else {
			System.out.println("Thansk for playing");
		}
	}

}
