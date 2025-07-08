package fundamentals;
import java.util.Scanner;
public class Largestsmallest {
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
		int max=a[0][0],i,j;
		for(int k=0;k<r;k++) {
			for(int l=0;l<c;l++) {
				if(a[k][l]>max) {
				max=a[k][l];
			}
		}

	}
		System.out.println(max);

	}
}
