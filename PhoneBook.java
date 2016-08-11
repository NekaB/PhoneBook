import java.util.Scanner;

public class PhoneBook {
	
	public static void main (String[] args){
		options();		
		/*This method prompts the user to enter phone number
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Phone Number");
		s = in.nextLine();
		System.out.println("You entered phone number ");
		System.out.println(s);*/
	}
	
	public static void options (){
	//This method gives the user choices on what to do
	
		char choice;
		
		String s = "no number";
		String read;
		Scanner keyboard = new Scanner(System.in);
		while (true){
			
			System.out.println("Please select from the following");
			System.out.println("n to Enter the number");
			System.out.println("s to Show the number ");
			System.out.println("c to Close the Phone book");
		
		  
		read = keyboard.nextLine();	
		choice = read.charAt(0);
		switch (choice) {
    case 'n': System.out.print("Enter Number: ");
			  s = keyboard.nextLine();
			  System.out.println();
              break;
    case 's': System.out.println("You Entered: ");
			  System.out.println(s);
			  System.out.println();
              break;
    case 'c': System.out.print("Close Book");
			  System.exit(0);
              break;
    default: System.out.println("Invalid Entry");
} 
		}
	}
	
}