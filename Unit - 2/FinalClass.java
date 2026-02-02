// H. Program to demonstrate "final" Class

// Final class - cannot be inherited
final class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    void displayInfo() {
        System.out.println("This is a final class - it cannot be inherited");
    }
}

// Trying to extend a final class will cause compilation error
// class ScientificCalculator extends Calculator { // Uncommenting this will
// cause error
// double squareRoot(double num) {
// return Math.sqrt(num);
// }
// }

// Another example of final class
final class ImmutablePoint {
    private final int x;
    private final int y;

    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        System.out.println("=== Final Class Demo ===\n");

        // Using final Calculator class
        System.out.println("1. Calculator Class (Final):");
        Calculator calc = new Calculator();
        calc.displayInfo();

        System.out.println("\nPerforming calculations:");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));

        // Using final ImmutablePoint class
        System.out.println("\n2. ImmutablePoint Class (Final):");
        ImmutablePoint point1 = new ImmutablePoint(10, 20);
        ImmutablePoint point2 = new ImmutablePoint(30, 40);

        point1.display();
        point2.display();

        System.out.println("\nWhy use final classes?");
        System.out.println("1. Security: Prevent inheritance and method overriding");
        System.out.println("2. Immutability: Create immutable classes (like String)");
        System.out.println("3. Performance: JVM can optimize final classes better");
        System.out.println("4. Design: Indicate that class is complete and shouldn't be extended");

        System.out.println("\nExamples of final classes in Java:");
        System.out.println("- String class");
        System.out.println("- Integer, Double, Boolean (wrapper classes)");
        System.out.println("- System class");
    }
}