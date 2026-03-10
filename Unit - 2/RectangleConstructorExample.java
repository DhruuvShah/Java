public class RectangleConstructorExample {
    double length;
    double width;

    public RectangleConstructorExample(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void displayArea() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        RectangleConstructorExample rect = new RectangleConstructorExample(3, 9);
        rect.displayArea();
    }

}