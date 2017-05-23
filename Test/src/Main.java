import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print num = new Print();
		
		for (int i = 0; i <= 9; i++){
			num.num(i);
			System.out.println("  ");
		}
		
		for (char i = 'a'; i <= 'z'; i++){
			num.letters(i);
			System.out.println("  ");
		}
		
		System.out.println("Choose a number from 0-9 to print: " );
		int n = in.nextInt();
		while (n > 9){
			System.out.println("Please choose a number from 0 to 9");
			n = in.nextInt();
		} 
		num.num(n);
		
		
		//String
		String s = in.nextLine();
		num.toCharacterArray(s);
		
		
		
		in.close();
	
	}
	
	
	
	
}