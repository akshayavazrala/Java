class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Length cannot be negative.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            System.out.println("Width cannot be negative.");
        }
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class getter_setter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(10.5);
        rectangle.setWidth(5.0);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
