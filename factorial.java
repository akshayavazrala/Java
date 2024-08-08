package project;

public class factorial {

	public static void main(String[] args) {
		int a = 10, multi = 1;
		for(int i=1; i<=a; i++){
			multi = multi*i;
		}
		System.out.println("The factorial of the given number is : " + multi);

	}

}
