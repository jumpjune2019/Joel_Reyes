import java.io.IOException;

public class Assignment03_SimpleDie  {

	public static void main(String[] args)throws java.io.IOException {
		
	letsPlay();
				
	}
	public static int ramdonGenerator() {
		int face = 1;
		face = (int) (Math.random()*6)+1;
		return face;
	}
	// printing die
	public static void printDie(int dieFace) {
		System.out.println("You have rolled a "+ dieFace);
	}
	public static void letsPlay() throws IOException {
		char key;
		
		System.out.print("Press any key to throw a die and press Enter (or Q and Enter to quit):");
		// Read a character from the keyboard.
		key = (char) System.in.read(); // get a char
		if (key == 'Q') {
			System.out.println("thansk for not playing");
		}else {
			printDie(ramdonGenerator());
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
			printDie(ramdonGenerator());
			
			letsPlayAgain();
		}else {
			System.out.println("Thansk for playing");
		}
	}
}
