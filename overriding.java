class Animal{
    void display(){
        System.out.println("It is a dog");
    }
}
class dog extends Animal{
    void display(){
        System.out.println("It is a Golden dog");
    }
}
public class overriding {
    public static void main(String[] args){
        dog d1 = new dog();
        d1.display();
    }   
}
