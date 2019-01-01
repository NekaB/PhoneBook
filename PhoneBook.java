import java.util.Scanner;

public class PhoneBook {

	public static void main (String[] args){
		options();
	}

	public static void options (){
		char choice;
		String s = "no number";
		String read;
		Scanner keyboard = new Scanner(System.in);
		while (true){

			System.out.println("Please select from the following:");
			System.out.println("n to Enter new number");
			System.out.println("s to Show all numbers for a single person");
			System.out.println("p to Show all numbers for all people");
			System.out.println("d to Delete a single number for a person");
			System.out.println("x to Delete all numbers");
			System.out.println("c to Close the phonebook");
			System.out.print("choice:");
			String choice = keyboard.nextLine();

			read = keyboard.nextLine();
			choice = read.charAt(0);
			switch (choice) {
				case 'n': System.out.print("Enter name: ");
				String name = keyboard.nextLine();
				System.out.print("Enter number:");
				String number = keyboard.nextLine();

				if (!phonebook.containsKey(name)){
					List entries = new ArrayList();
					entries.add(number);
					phonebook.put(name, entries);
				} else {
					List entries = phonebook.get(name);
				if (entries.size()) entries = phonebook.get(name);
				
			
				for (int i = 0; i; entries = phonebook.entrySet(name)) {
					String entryName = entry.getKey();
					List numbers = entry.getValue();
					
					System.out.println ("Entries for + entryName + ");
					for (int i = 0; i; entries = phonebook.get(name));
					// Loops through a persons phone numbers
					for (int i = 0; i; entries.size()) i++; {
					System.out.println(i + 1 + entries.get(i));
				}
				System.out.print( "Which one do you want to delete?" ); 
				 // n is the new line escape sequence
				int num = keyboard.nextInt();
				entries.remove(num - 1);
				phonebook.replace(name, entries);
				if (keyboard.entries.remove(num - 1);
				} else {
				System.out.println("The name you entered isn't in the phonebook.");
				}
				break;
				//start here with case c
				read = keyboard.nextLine();
			choice = read.charAt(0);
			switch (choice) {
				case 's': System.out.println("You Entered : ");
				System.out.println(s);
				break;
				case 'x':
				System.out.println(x);
				break;
				case 'c': System.out.print("Close Book");
				System.exit(0);
				break;
				default: System.out.println("Invalid Entry");
			}
		}
	}
