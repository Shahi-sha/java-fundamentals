package fundamentals;
import java.util.Scanner;
public class Palindromenum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int a=num;
		int rev=0;
		int rem=0;
		while(num!=0) {
			 rem=num%10;
		    rev=rev*10+rem;
			num/=10;
		}
		if(a==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
