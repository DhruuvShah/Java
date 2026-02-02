// I. Program to demonstrate "abstract" keyword for function

// Abstract class with abstract method
abstract class Shape {
    String color;
    
    // Constructor
    Shape(String c) {
        color = c;
    }
    
    // Abstract method (no implementation)
    abstract double calculateArea();
    
    // Abstract method for perimeter
    abstract double calculatePerimeter();
    
    // Concrete method (with implementation)
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Concrete class implementing abstract methods
class Circle extends Shape {
    double radius;
    
    Circle(String color, double r) {
        super(color);
        radius = r;
    }
    
    // Implementing abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    Rectangle(String color, double l, double w) {
        super(color);
        length = l;
        width = w;
    }
    
    // Implementing abstract methods
    @Override
    double calculateArea() {
        return length * width;
    }
    
    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double base;
    double height;
    double side1, side2, side3;
    
    Triangle(String color, double b, double h, double s1, double s2, double s3) {
        super(color);
        base = b;
        height = h;
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    
    // Implementing abstract methods
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
    
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        System.out.println("=== Abstract Method Demo ===\n");
        
        // Cannot create object of abstract class
        // Shape shape = new Shape("Red");  // This will cause error
        
        // Creating Circle object
        System.out.println("1. CIRCLE:");
        Circle circle = new Circle("Red", 5.0);
        circle.displayColor();
        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Perimeter: " + String.format("%.2f", circle.calculatePerimeter()));
        
        // Creating Rectangle object
        System.out.println("\n2. RECTANGLE:");
        Rectangle rectangle = new Rectangle("Blue", 10.0, 6.0);
        rectangle.displayColor();
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        
        // Creating Triangle object
        System.out.println("\n3. TRIANGLE:");
        Triangle triangle = new Triangle("Green", 8.0, 6.0, 5.0, 6.0, 7.0);
        triangle.displayColor();
        System.out.println("Base: " + triangle.base);
        System.out.println("Height: " + triangle.height);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        
        // Polymorphism with abstract class
        System.out.println("\n4. POLYMORPHISM DEMO:");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Yellow", 3.0);
        shapes[1] = new Rectangle("Purple", 5.0, 4.0);
        shapes[2] = new Triangle("Orange", 6.0, 4.0, 4.0, 5.0, 6.0);
        
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\nShape " + (i + 1) + ":");
            shapes[i].displayColor();
            System.out.println("Area: " + String.format("%.2f", shapes[i].calculateArea()));
        }
        
        System.out.println("\nKey Points:");
        System.out.println("- Abstract methods have no implementation in abstract class");
        System.out.println("- Subclasses must implement all abstract methods");
        System.out.println("- Abstract class can have both abstract and concrete methods");
    }
}