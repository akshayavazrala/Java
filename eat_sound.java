
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }

    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Lion extends Animal {
    public void eat() {
        System.out.println("The Lion eats meat.");
    }

    public void sound() {
        System.out.println("The Lion roars.");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("The Tiger eats deer.");
    }

    public void sound() {
        System.out.println("The Tiger growls.");
    }
}

class Panther extends Animal {
    public void eat() {
        System.out.println("The Panther eats small animals.");
    }

    public void sound() {
        System.out.println("The Panther growls softly.");
    }
}

public class eat_sound {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();

        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}
