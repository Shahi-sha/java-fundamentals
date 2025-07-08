package fundamentals;
import java.util.Scanner;
public class SortedArray {
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
		for(int k=0;k<n;k++) {
			System.out.print(a[k] +" ");
		}
	}
}


