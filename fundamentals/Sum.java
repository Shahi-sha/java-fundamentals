package fundamentals;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=a+b;
        System.out.println("The sum of " + a  +  " and "  + b +  " is "  + c);
	}

}
