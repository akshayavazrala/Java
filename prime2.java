import java.util.Scanner;

public class prime2 {
    public static int prime(int a) {
        int count = 0;
        for (int i = 2; i <= a / 2; i++) {  
            if (a % i == 0) {
                count++; 
                break;    
            }
        }
        return count;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is a prime number or not: ");
        int a = scanner.nextInt();

        int count = prime(a);  

        if (count == 0) {
            System.out.println("The given number " + a + " is a prime number.");
        } else {
            System.out.println("The given number " + a + " is not a prime number.");
        }

        scanner.close();
    }
}
