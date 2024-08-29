package project;
public class dog {
    private String name;
    private String color;

    public dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        dog myDog = new dog("Buddy", "Golden");
        myDog.printDetails();
    }
}
