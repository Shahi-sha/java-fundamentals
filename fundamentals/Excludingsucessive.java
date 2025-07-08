package fundamentals;
import java.util.Scanner;
public class Excludingsucessive {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int sum=0;
		int skip=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==6) {
				skip=1;
				continue;
			}
			 if(a[i]==7 && skip==1) {
				skip=0;
				continue;
			}
			 if(skip==0) {
				 sum+=a[i];
			 }
		}
        System.out.print(sum);
	}

}
