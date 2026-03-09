public class Rectangles {
    double length;
    double width;

    Rectangles() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public void displayArea() {
        double area = length * width;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangles rect1 = new Rectangles();
        rect1.displayArea();
    }

}