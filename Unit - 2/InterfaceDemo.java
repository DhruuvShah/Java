// K. Program to demonstrate the concept of interface in Java

// Interface 1
interface Drawable {
    // Abstract method (public and abstract by default)
    void draw();

    // Another abstract method
    void resize(int size);
}

// Interface 2
interface Colorable {
    void setColor(String color);

    void displayColor();
}

// Class implementing single interface
class Circle implements Drawable {
    int radius;

    Circle(int r) {
        radius = r;
    }

    // Implementing interface methods
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    public void resize(int size) {
        radius = size;
        System.out.println("Circle resized to radius: " + radius);
    }
}

// Class implementing multiple interfaces
class Rectangle implements Drawable, Colorable {
    int length, width;
    String color;

    Rectangle(int l, int w) {
        length = l;
        width = w;
        color = "White";
    }

    // Implementing Drawable interface
    public void draw() {
        System.out.println("Drawing a Rectangle: " + length + " x " + width);
    }

    public void resize(int size) {
        length = size;
        width = size;
        System.out.println("Rectangle resized to: " + length + " x " + width);
    }

    // Implementing Colorable interface
    public void setColor(String c) {
        color = c;
    }

    public void displayColor() {
        System.out.println("Rectangle color: " + color);
    }
}

// Interface with default method (Java 8+)
interface Printable {
    void print();

    // Default method
    default void printInfo() {
        System.out.println("This is a printable object");
    }

    // Static method
    static void description() {
        System.out.println("Printable interface provides printing functionality");
    }
}

class Document implements Printable {
    String content;

    Document(String c) {
        content = c;
    }

    public void print() {
        System.out.println("Printing document: " + content);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Demo ===\n");

        // Example 1: Single interface implementation
        System.out.println("1. SINGLE INTERFACE EXAMPLE:");
        System.out.println("-----------------------------");
        Circle circle = new Circle(5);
        circle.draw();
        circle.resize(10);

        // Example 2: Multiple interface implementation
        System.out.println("\n2. MULTIPLE INTERFACE EXAMPLE:");
        System.out.println("-------------------------------");
        Rectangle rect = new Rectangle(10, 20);
        rect.draw();
        rect.setColor("Red");
        rect.displayColor();
        rect.resize(15);

        // Example 3: Interface with default method
        System.out.println("\n3. DEFAULT METHOD EXAMPLE:");
        System.out.println("---------------------------");
        Document doc = new Document("Annual Report 2024");
        doc.print();
        doc.printInfo(); // Calling default method

        // Calling static method
        System.out.println("\n4. STATIC METHOD EXAMPLE:");
        System.out.println("--------------------------");
        Printable.description();

        // Polymorphism with interface
        System.out.println("\n5. POLYMORPHISM WITH INTERFACE:");
        System.out.println("--------------------------------");
        Drawable[] shapes = new Drawable[2];
        shapes[0] = new Circle(7);
        shapes[1] = new Rectangle(12, 8);

        for (Drawable shape : shapes) {
            shape.draw();
        }

        System.out.println("\n=== KEY POINTS ABOUT INTERFACES ===");
        System.out.println("1. All methods are public and abstract by default");
        System.out.println("2. Variables are public, static, and final by default");
        System.out.println("3. A class can implement multiple interfaces");
        System.out.println("4. Interfaces achieve multiple inheritance in Java");
        System.out.println("5. Cannot instantiate an interface");
        System.out.println("6. Can have default and static methods (Java 8+)");
    }
}