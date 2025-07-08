package fundamentals;
import java.util.Scanner;
public class ODDeven {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String s=(a%2==0) ? "Even Number" : "Odd Number" ;
        System.out.println(s);
        
	}
}
