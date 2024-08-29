package project;

public class Cat {

 private String name;
 private int age;

 public Cat() {
     this.name = "smily";
     this.age = 10;
 }


 public void printDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }


 public static void main(String[] args) {

     Cat myCat = new Cat();
     myCat.printDetails();
 }
}
