package project;
import java.util.Scanner;

public class simple_intrest {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int p ;
	     int r;
	     int t;
	     int si;
	     
	     System.out.print("Enter Princple value: ");
	     p = scanner.nextInt();
	     
	     System.out.print("Enter Rate value: ");
	     r = scanner.nextInt();
	     
	     System.out.print("Enter Time value: ");
	     t = scanner.nextInt();
	     scanner.nextLine();
	     
	     si = (p*r*t)/100;
	     
	     System.out.println("\nSimple Intrest: " + si);
	     scanner.close();

	}

}
