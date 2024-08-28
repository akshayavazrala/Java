import java.util.Scanner;

public class factorial2 {

    public static int factorial(int n) {
        int i, fact = 1;
        for(i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
        
        scanner.close();  

    }
}
