
public class numbers {

	void num (int x) {
		switch (x){
		case 0:
			System.out.print(top() + "\n" + stick() + "  " + stick() + "\n" + stick() + bot() + stick());
			break;
		case 1:
			System.out.print("   " + stick() + "\n   " + stick());
			break;
		case 2:
			System.out.print(top() + "\n " + bot() + stick() + "\n" + stick() + bot());
			break;
		case 3:
			System.out.print(top() + "\n " + bot() + stick() + "\n " + bot() + stick());
			break;
		case 4:
			System.out.print(stick() + bot() + stick() + "\n   " + stick());
			break;
		case 5:
			System.out.print(top() + "\n" + stick() + bot() + "\n " + bot() + stick());
			break;
		case 6:
			System.out.print(top() + "\n" + stick() + bot() + "\n" + stick() + bot() + stick());
			break;
		case 7:
			System.out.print(top() +  "\n   " + stick() + "\n   " + stick());
			break;
		case 8:
			System.out.print(top() + "\n" + stick() + bot() + stick() + "\n" + stick() + bot() + stick());
			break;
		case 9:
			System.out.print(top() + "\n" + stick() + bot() + stick() + "\n " + bot() + stick());
			break;
		default:
			System.out.print(" ");
			break;
		}
			
	}
	
	String stick(){
		String i = "|";
		return i;
	}
	
	String rightStick(){
		String i = " |";
		return i;
	}
	
	
	String top() {
		String i = " __ ";
		return i;
	}
	String bot() {
		String i = "__";
		return i;
	}
	
	
	public Character[] toCharacterArray( String s ) {

		   if ( s == null ) {
		     return null;
		   }

		   int len = s.length();
		   Character[] array = new Character[len];
		   for (int i = 0; i < len ; i++) {
		      array[i] = new Character(s.charAt(i));
		   }

		   return array;
		}
	
}
