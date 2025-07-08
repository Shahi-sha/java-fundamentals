package fundamentals;
import java.util.Scanner;
public class PositiveNeg {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>0) {
        	System.out.println("Positive Number");
        }
        else if(a<0) {
        	System.out.println("Negative Number");
        }
        else {
        	System.out.println("Zero");
        }
	}
}
