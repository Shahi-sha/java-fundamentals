package fundamentals;
public class Colour {
	public static void main(String[] args) {
		char ch='B';
		switch(ch) {
		case 'G':
			System.out.println("Green");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		case 'R':
			System.out.println("Red");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("Invalid Code");
		}
	}
}
