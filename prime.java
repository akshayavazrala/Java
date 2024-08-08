package project;

public class prime {

	public static void main(String[] args) {
		int a = 2, count = 0, i;
		for(i=2; i<a; i++)
	      {
	         if(a%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Prime Number.");
	      else
	         System.out.println("\nIt is not a Prime Number.");
	}

}
