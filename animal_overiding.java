package project;


 class animal_overiding1 {
         void move() {
        System.out.println("The animal is moving");
    }
}


class Cheetah extends animal_overiding1 {

     void move() {
        System.out.println("The cheetah is running");
    }
}


public class animal_overiding {
    public static void main(String[] args) {
     
    	animal_overiding1 myAnimal = new animal_overiding1();
        myAnimal.move();  
        

        Cheetah myCheetah = new Cheetah();
        myCheetah.move(); 
        
  
        animal_overiding1 myPolymorphicCheetah = new Cheetah();
        myPolymorphicCheetah.move(); 
    }
}
