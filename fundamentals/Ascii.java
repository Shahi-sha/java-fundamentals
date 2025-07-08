package fundamentals;
import java.util.Scanner;
public class Ascii {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
        char b[]=new char[n];
        for(int i=0;i<n;i++) {
        	a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++) {
        	b[i]=(char)a[i];
        }
        System.out.println(b);
	}

}
