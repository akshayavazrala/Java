package project;
import java.util.Scanner;

public class first_letter {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        if (name != null && !name.isEmpty()) {
	            char firstLetter = name.charAt(0);
	            System.out.println("The first letter of your name is: " + firstLetter);
	        } 
	        
	        else {
	            System.out.println("The name you entered is empty.");
	        }

	        scanner.close();
	   }
}

