package fundamentals;
import java.util.Scanner;
public class AllSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int l=String.valueOf(n).length();
		for(int i=0;i<=l;i++){
			int rem=n%10;
			 sum+=rem;
			n/=10;
		}
		System.out.println(sum);

	}

}
