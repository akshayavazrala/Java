package project;
import java.util.Scanner;

public class area_me_over {
	
	public int display(int a) {
        return(a*a);
    }
	public double display(double r) {
		return (Math.PI*r*r);
	}
	public int disply(int x,int y) {
		return (x*y);
	}

	public static void main(String[] args) {
		area_me_over myobj = new area_me_over();
		Scanner scanner = new Scanner(System.in);
		
		int a,x,y;
		double r;
		

		System.out.print("Enter Princple value: ");
	    a = scanner.nextInt();
	     
	    System.out.print("Enter Rate value: ");
	    x = scanner.nextInt();
	     
	    System.out.print("Enter Time value: ");
	    y = scanner.nextInt();
	    
	    System.out.print("Enter Princple value: ");
	    r = scanner.nextInt();
	    
	    scanner.close();
	     
	    

	}

}
