package fundamentals;
import java.util.Scanner;
public class Gender {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String s="Female";
        int age=scan.nextInt();
        if(s.equals(a) ) {
        	if(age>=1 && age<=58) {
        		System.out.println("the percentage of interest is 8.2%");
        	}
        	else if(age>=59 && age<=100) {
        		System.out.println("the percentage of interest is 9.2%");
        	}
        }
        else if(a=="Male" ) {
        	if(age>=1 && age<=58) {
        		System.out.println("the percentage of interest is 8.4%");
        	}
        	else if(age>=59 && age<=100) {
        		System.out.println("the percentage of interest is 10.5%");
        	}
        	
        }
	}

}
