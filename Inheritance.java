class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int bonus = 10000;
}

public class Inheritance {
    public static void main(String[] args) {
        Engineer e1 = new Engineer();
        System.out.println("Salary: " + e1.salary);
        System.out.println("Bonus: " + e1.bonus);
    }
}
