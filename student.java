package project;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age;
        String grade;
        
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter student's age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid age.");
            scanner.next(); 
            System.out.print("Enter student's age: ");
        }
        
        age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter student's grade: ");
        grade = scanner.nextLine();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}