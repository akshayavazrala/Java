package project;

public class get_set {
	
	 private int id;
	 private String name;
	 private String position;
	 
	 public get_set(int id, String name, String position) {
		 this.id = id;
		 this.name = name;
		 this.position = position;
	 }
	 
	 public int getId() {
	     return id;
	 }

	 public void setId(int id) {
	     this.id = id;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName(String name) {
	     this.name = name;
	 }
	   
	 public String getPosition() {
	     return position;
	 }

	 public void setPosition(String position) {
	     this.position = position;
	 }

	 public static void main(String[] args) {

	     get_set emp = new get_set(1, "John Doe", "Software Engineer");

	     System.out.println("Employee Details:");
	     System.out.println("ID: " + emp.getId());
	     System.out.println("Name: " + emp.getName());
	     System.out.println("Position: " + emp.getPosition());

	     emp.setId(2);
	     emp.setName("Jane Smith");
	     emp.setPosition("Senior Software Engineer");

	     System.out.println("\nUpdated Employee Details:");
	     System.out.println("ID: " + emp.getId());
	     System.out.println("Name: " + emp.getName());
	     System.out.println("Position: " + emp.getPosition());
	    }
	}