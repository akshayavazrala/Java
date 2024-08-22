package project;

public class diff_me_over {
	public void display(int num,String name) {
        System.out.println("Integer: " + num);
        System.out.println("String: " + name);
    }

    public void display(double number,int num,String name) {
        System.out.println("Double: " + number);
        System.out.println("Integer: " + num);
        System.out.println("String: " + name);
    }

	public static void main(String[] args) {
		diff_me_over myobj = new diff_me_over();
		myobj.display(10,"Akshaya");         
        myobj.display(3.14,12,"Reddy");        
		
		

	}

}

