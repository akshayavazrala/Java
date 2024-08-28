import java.util.Scanner;

public class armstrong {
    public static int strong(int n){
        int temp = n;
        int digits = 0;
        int sum = 0;
        while(n>0){
            n/=10;
            digits++;
        }
        n = temp;
        while(n>0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check weather the given number is armstrong or not: ");
        int n = scanner.nextInt();

        int sum = strong(n);
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        scanner.close();
    }

}
    
