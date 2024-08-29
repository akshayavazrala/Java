package project;
public class computer {

    class Processor {
        private String brand;
        private double speed; 

        public Processor(String brand, double speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public void displayDetails() {
            System.out.println("Processor Brand: " + brand);
            System.out.println("Processor Speed: " + speed + " GHz");
        }
    }

    public static void main(String[] args) {

        computer myComputer = new computer();
        
        computer.Processor myProcessor = myComputer.new Processor("Intel", 3.5);

        myProcessor.displayDetails();
    }
}