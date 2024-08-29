package project;


class area_overiding1 {
    
    double getArea() {
        return 0.0;
    }
}


class Rectangle extends area_overiding1 {
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    double getArea() {
        return width * height;
    }
}

public class area_overiding {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        double area = myRectangle.getArea();

        System.out.println("The area of the rectangle is: " + area);
    }
}
