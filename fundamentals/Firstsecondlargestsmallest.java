package fundamentals;
import java.util.Scanner;
public class Firstsecondlargestsmallest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}	
		}
		}
			System.out.println("smallest: " + a[0] + " " + a[1]);
			System.out.println("max: " + a[n-1] +" " + a[n-2]);

	}

}

