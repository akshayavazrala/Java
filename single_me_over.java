package project;

public class single_me_over {
	public void display(int number) {
        System.out.println("Integer: " + number);
    }

    public void display(double number) {
        System.out.println("Double: " + number);
    }

    public void display(String message) {
        System.out.println("String: " + message);
    }

	public static void main(String[] args) {
		single_me_over myobj = new single_me_over();
		myobj.display(10);         
        myobj.display(3.14);        
        myobj.display("Hello!");
		
		

	}

}
