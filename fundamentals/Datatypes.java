package fundamentals;
import java.util.Scanner;
class Datatypes {
	public static void main(String[] args) {
		char ch= 'A';
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println(ch + " = " +  "Alphabet");	
		}
		else if(ch>='0' && ch<='9') {
			System.out.println(ch + " = " +  "Digit");
		}
		else {
			System.out.println("Special Character");
		}	
	}
}
