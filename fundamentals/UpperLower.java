package fundamentals;
import java.util.Scanner;
public class UpperLower {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch='A';
	if(ch >='Z') {
		char c1 = Character.toUpperCase(ch);
		System.out.println(c1);
	}
	else {
		char c2=Character.toLowerCase(ch);
		System.out.println(c2);
	}
	}
}
