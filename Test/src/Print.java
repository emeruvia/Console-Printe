
public class Print {

	void elementValue(char x) {
		char y = Character.toLowerCase(x);
		switch (y) {
		case '0':
			System.out.print(top() + stick() + "  " + stick() + "\n" + stick() + bot() + stick());
			break;
		case '1':
			System.out.print("\n   " + stick() + "\n   " + stick());
			break;
		case '2':
			System.out.print(top() + " " + bot() + stick() + "\n" + stick() + bot());
			break;
		case '3':
			System.out.print(top() + " " + bot() + stick() + "\n " + bot() + stick());
			break;
		case '4':
			System.out.print("\n" + stick() + bot() + stick() + "\n   " + stick());
			break;
		case '5':
			System.out.print(top() + stick() + bot() + "\n " + bot() + stick());
			break;
		case '6':
			System.out.print(top() + stick() + bot() + "\n" + stick() + bot() + stick());
			break;
		case '7':
			System.out.print(top() + "   " + stick() + "\n   " + stick());
			break;
		case '8':
			System.out.print(top() + stick() + bot() + stick() + "\n" + stick() + bot() + stick());
			break;
		case '9':
			System.out.print(top() + stick() + bot() + stick() + "\n " + bot() + stick());
			break;
		case 'a':
			System.out.print(top() + botBox() + "\n" + sideSticks());
			break;
		case 'b':
			System.out.print(top() + botBox() + "\n" + botBox());
			break;
		case 'c':
			System.out.print(top() + stick() + "\n" + stick() + bot());
			break;
		case 'd':
			System.out.print(top() + sideSticks() + "\n" + botBox());
			break;
		case 'e':
			System.out.print(top() + leftBot() + "\n" + leftBot());
			break;
		case 'f':
			System.out.print(top() + leftBot() + "\n" + stick());
			break;
		case 'g':
			System.out.print(top() + stick() + " _\n" + botBox());
			break;
		case 'h':
			System.out.print("\n" + botBox() + "\n" + sideSticks());
			break;
		case 'i':
			System.out.print("___ \n | \n_|_");
			break;
		case 'j':
			System.out.print("\n   " + stick() + "\n" + botBox());
			break;
		case 'k':
			System.out.print("\n" + stick() + "_/\n" + stick() + " \\");
			break;
		case 'l':
			System.out.print("\n" + stick() + "\n" + leftBot());
			break;
		case 'm':
			System.out.print("\n" + stick() + "\\/" + stick() + "\n" + sideSticks());
			break;
		case 'n':
			System.out.print("\n" + stick() + "\\ " + stick() + "\n" + stick() + " \\" + stick());
			break;
		case 'o':
			System.out.print(top() + sideSticks() + "\n" + botBox());
			break;
		case 'p':
			System.out.print(top() + botBox() + "\n" + stick());
			break;
		case 'q':
			System.out.print(top() + sideSticks() + "\n" + stick() + "_\\" + stick());
			break;
		case 'r':
			System.out.print(top() + botBox() + "\n" + stick() + " \\");
			break;
		case 's':
			System.out.print(top() + leftBot() + "\n" + rightBot());
			break;
		case 't':
			System.out.print("___ \n | \n | ");
			break;
		case 'u':
			System.out.print("\n" + sideSticks() + "\n" + botBox());
			break;
		case 'v':
			System.out.print("\n\\  /\n \\/");
			break;
		case 'w':
			System.out.print("\n" + sideSticks() + "\n\\/\\/");
			break;
		case 'x':
			System.out.print("\n\\ / \n/ \\");
			break;
		case 'y':
			System.out.print("\n" + botBox() + "\n" + rightBot());
			break;
		case 'z':
			System.out.print(top() + "  /\n /_");
		default:
			System.out.println();
			break;

		}
	}

	String stick() {
		String i = "|";
		return i;
	}

	String top() {
		String i = " __ ";
		return i + "\n";
	}

	String bot() {
		String i = "__";
		return i;
	}

	String botBox() {
		String i = "|__|";
		return i;
	}

	String sideSticks() {
		String i = "|  |";
		return i;
	}

	String leftBot() {
		String i = "|__";
		return i;
	}

	String rightBot() {
		String i = " __|";
		return i;
	}

}
