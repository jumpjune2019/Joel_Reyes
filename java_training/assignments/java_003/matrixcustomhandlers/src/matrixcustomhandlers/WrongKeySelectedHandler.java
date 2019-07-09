package matrixcustomhandlers;

public class WrongKeySelectedHandler extends  Exception{
	int one;
	public WrongKeySelectedHandler(int one) {
		this.one = one;
		
		
	}
	
	public String toString() {
		
		return "Wrong options entered= "+ one;
	}
}
