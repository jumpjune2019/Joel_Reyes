
public class CointFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for loop to roll the dice 4 times
		for (int i=0; i<1001;i++) {
			// calls headOrTail() and RamdonGenerator and prints them.
			System.out.println("Coint Flip Program \n"+ "The Coin Flip is: "
							+ headOrTail(ramdonGenerator())
							);
		}
	}
	// Generate randon between 1 and 2
	public static int ramdonGenerator() {
		int face = 1;
		face = (int)(Math.random()*2+1);
		return face;
	}
	//returns head or tails
	public static String headOrTail(int ramdon) {
		String face = "";
		if (ramdon == 1) {
			face = "Head";
		}else if(ramdon ==2) {
			face = "Tail";
		}else {
			face="We don't have that kind of dice";
		}
		return face;
	}
	
	

}
