package project;

public class constructor {
	 String name;
	 constructor () {
	    System.out.println("Constructor Called:");
	    name = "Hello World";
	  }

	  public static void main(String[] args) {
		constructor obj = new constructor ();
	    System.out.println("The name is " + obj.name);
	  }
}
