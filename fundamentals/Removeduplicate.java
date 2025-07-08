package fundamentals;
import java.util.Scanner;
public class Removeduplicate {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int k=0;
			int a[]=new int[n];
            for(int i=0;i<n;i++) {
            	a[i]=scan.nextInt();
            	}
            for(int i=0;i<n;i++) {
            	int j;
            	for(j=0;j<k;j++) {
            		if(a[i]==a[j]) {
            			break;
            		}
            	}
            	if(j==k) {
            		a[k++]=a[i];
            		
            	}
            }
            for(int l=0;l<k;l++) {
        		System.out.print(a[l] + " ");
        	}
	}

}
