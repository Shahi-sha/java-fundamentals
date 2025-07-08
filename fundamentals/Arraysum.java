package fundamentals;
import java.util.Scanner;
public class Arraysum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        }
        for(int num:arr) {
           sum+=num;
        }
        	System.out.println("sum: " + sum);
        	System.out.println("Average: " + sum/n);
	

}
}
