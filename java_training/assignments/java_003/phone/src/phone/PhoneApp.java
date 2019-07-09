package phone;


import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PhoneApp {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String [][] onePhoneBook =phoneBook();
		printToScreen(onePhoneBook);
		printToFile(onePhoneBook);
//		String [] array = new String[3];
//		array=returnInput();
//		System.out.println(array[0]+array[1]+array[2]);
	}
public static String[][] phoneBook() throws IOException {
	String [][] phoneBook= new String[6][3];
	//Scanner input = new Scanner(System.in);
	//String inputString ="";
	String[] array=new String[3];
	
	phoneBook[0][0]="Name";
	phoneBook[0][1]="Phone Number";
	phoneBook[0][2]="City";
	
	
	 for (int row = 1; row < phoneBook.length; row++) { 
	      //  for (int col = 0; col < phoneBook[row].length; col++) {
	        	
	        	array=returnInput();
	        	
	        	phoneBook[row][0]=array[0];
	        	phoneBook[row][1]=array[1];
	        	phoneBook[row][2]=array[2];
//	        	if(col==0){
//	                System.out.println("Enter name: ");
//	            	phoneBook[row][0] = phoneInput(input);
//	            }else if(col==1){
//	                System.out.println("Enter phone number: ");
//		            phoneBook[row][1] = phoneInput(input);
//	            }else if(col==2){
//	               	System.out.println("Enter city: ");
//	               	phoneBook[row][2] = phoneInput(input);
//	            }
	        //    call for input
	           // take input
	           // check imput
	            //if not null put it in array 
	             //if null pront again fire exception
	        

		//}
	     //print out namePhoneCity
	        //Ask user if information is correct
	        //row--
	 }
	
	//************************************************************
		
	return phoneBook;
	}
public static void printToScreen(String[][]array) {
	try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
		for (String[] row : array) {
            for (String elem : row) {
                System.out.format("%-15s ", elem );
            }
            System.out.println();
		}
		
		} catch (IOException exc) {
		System.out.println("Write Error.");
		}
}
public static void printToFile(String[][]array) {
	
	//save to file
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
			//create file
					FileWriter fw = new FileWriter("phone.txt");
					BufferedWriter out= new BufferedWriter(fw);
					
					

					for (String[] row : array) {
						for (String elem : row) {
							out.write(elem +"\t \t");
						}
						out.write("\n");
					}
					out.close();
			
			
		} catch (IOException exc) {
			System.out.println("Write Error.");
		}
}
public static String phoneInput(Scanner input) {
	String inputString=null;
	try {
	
		 inputString = input.nextLine();
		 // do not use == to compare string it wont work
		 if(inputString.equals("")) {
				// how to call my custom handler
					throw new nullContentException();
			}
	}catch(nullContentException exc){
		System.out.println("input string was null"+"\n"+"Please enter right if this time: ");
		phoneInput(input);
		
	}
	return inputString;
}
public static String [] returnInput() throws IOException {
	Scanner input = new Scanner(System.in);
	String[]namePhoneCity=new String[3];
	
	
			System.out.println("Enter Name: ");
     	   namePhoneCity[0]=phoneInput(input);
     	  System.out.println("Enter Phone: ");
     	   namePhoneCity[1]=phoneInput(input);
     	  System.out.println("Enter City: ");
     	   namePhoneCity[2]=phoneInput(input);
        
		System.out.println("Is this right?");
		
	         System.out.println("Name: "+ namePhoneCity[0]
	        			   	   +" Phone: "+ namePhoneCity[1]
	        			   	   +" City: "+ namePhoneCity[2]);
	         System.out.println("Press (y) for yes (n) for to re-enter information");
	      // Read a character from the keyboard.
	         String key;
	 		key =  input.nextLine(); // get a char
	 		if (key.equals("y") ) {
	 			return namePhoneCity;
	 		}else if(key.equals("n") ) {
	 			returnInput();
	 		}else {
	 			System.out.println("that was not an options lets make sure we start again");
	 			returnInput();
	 		}
   
	return namePhoneCity;
}
}

 