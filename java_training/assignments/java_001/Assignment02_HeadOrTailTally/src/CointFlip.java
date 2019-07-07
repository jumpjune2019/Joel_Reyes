
public class CointFlip {

	public static void main(String[] args) {
		tally();
	}
	// print tally
	public static void tally() {
		// array holds tally occurrences. 
		
		int[] counter = {0,0};
		// for loop to roll the dice 1000 times
		for (int i=1; i<1001;i++) {
			int face = ramdonGenerator();
			if (face ==1) {
				counter[0]++ ;
			}else{
				counter[1]++;
				}
			
			}
		
		System.out.println("1000 Coin Flips \n"+ 
						"Count of Head: " + counter[0] +"\n"+
						"Count of Tail: "+ counter[1] 
		    );
		
	}
	// Generate random between 1 and 2
	public static int ramdonGenerator() {
		int face = 1;
		face = (int) (Math.random()*2)+1;
		return face;
	}
}
