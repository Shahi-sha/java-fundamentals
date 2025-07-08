package fundamentals;
import java.util.Scanner;
public class Elementinarray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("element to be searched: ");
		int s=scan.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==s) {
				System.out.println("index: " + i);
				return;
			}
		}
				System.out.println("-1");
				
			}
		}
		


