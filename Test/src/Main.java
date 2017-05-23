import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Creates a value object from print
		Print value = new Print();

		//Output the welcoming message
		System.out.println("Welcome!");
		System.out.println("This program is a console printer. \nMeaning that anything"
				+ "that you input into the console\nline is going to be drawn "
				+ "into the console vertically.");
		
		//Take users input
		System.out.println("\nTry it yourself, Please enter anything: ");
		String s = in.nextLine();
		//This will convert the string to a character array
		char array[] = s.toCharArray();
		for (int i = 0; i < array.length; i++){
			value.elementValue(array[i]);
			System.out.println();
		}
		in.close();
	}
}