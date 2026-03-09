public class Rectangle3 {
    double length;
    double width;

    public Rectangle3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void displayArea() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle3 rect = new Rectangle3(3, 9);
        rect.displayArea();
    }

}