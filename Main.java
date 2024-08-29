import java.util.Scanner;

class person {
    private String firstName;
    private String lastName;
    
    public person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
}
class employee extends person{
    private String employeeId;
    private String jobTitle;

    public employee(String firstName, String lastName, String employeeId, String jobTitle){
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 1st name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter job title: ");
        String jobTitle = scanner.nextLine();

        employee emp = new employee(firstName, lastName, employeeId, jobTitle);

        System.out.println("Employee Details:");
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName()); // Will include job title
        System.out.println("Employee ID: " + emp.getEmployeeId());

        scanner.close();
    }
}