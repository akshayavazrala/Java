import java.util.Scanner;

public class palindrom2{

    public static int palindrom(int n){
        int r,sum = 0;
        while(n > 0){
            r=n%10;  
            sum=(sum*10)+r;    
            n=n/10;    
        } 
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = palindrom(n);
        if(n == result)    
		System.out.println("the give number " +  n + " is palindrome ");    
		else    
		System.out.println("the given number " + n + " is not palindrome");   

        scanner.close();
    }
}