package fundamentals;
import java.util.Scanner;
public class Reversenum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int rev=0;
		int rem=0;
		while(num>0) {
			 rem=num%10;
		    rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
}
}
