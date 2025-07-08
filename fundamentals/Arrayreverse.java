package fundamentals;
import java.util.Scanner;
public class Arrayreverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		int c=scan.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		for(int i=r-1;i>=0;i--) {
			for(int j=c-1;j>=0;j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
