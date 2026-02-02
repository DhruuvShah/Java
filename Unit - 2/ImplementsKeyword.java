// L. Program to demonstrate "implements" keyword in Java

// Interface for basic operations
interface MathOperations {
    int add(int a, int b);

    int subtract(int a, int b);

    int multiply(int a, int b);

    double divide(int a, int b);
}

// Interface for advanced operations
interface AdvancedOperations {
    double power(double base, double exponent);

    double squareRoot(double num);
}

// Class implementing single interface
class BasicCalculator implements MathOperations {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}

// Class implementing multiple interfaces
class ScientificCalculator implements MathOperations, AdvancedOperations {

    // Implementing MathOperations interface
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        }
        return 0;
    }

    // Implementing AdvancedOperations interface
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Error: Cannot find square root of negative number!");
            return 0;
        }
    }
}

// Another interface example
interface Vehicle {
    void start();

    void stop();

    void accelerate(int speed);
}

// Class implementing Vehicle interface
class Car implements Vehicle {
    String model;
    int currentSpeed;

    Car(String m) {
        model = m;
        currentSpeed = 0;
    }

    @Override
    public void start() {
        System.out.println(model + " - Engine started!");
        currentSpeed = 0;
    }

    @Override
    public void stop() {
        System.out.println(model + " - Engine stopped!");
        currentSpeed = 0;
    }

    @Override
    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println(model + " - Accelerating to " + currentSpeed + " km/h");
    }
}

public class ImplementsKeyword {
    public static void main(String[] args) {
        System.out.println("=== Implements Keyword Demo ===\n");

        // Example 1: Single interface implementation
        System.out.println("1. BASIC CALCULATOR (Single Interface):");
        System.out.println("----------------------------------------");
        BasicCalculator basic = new BasicCalculator();
        System.out.println("10 + 5 = " + basic.add(10, 5));
        System.out.println("10 - 5 = " + basic.subtract(10, 5));
        System.out.println("10 * 5 = " + basic.multiply(10, 5));
        System.out.println("10 / 5 = " + basic.divide(10, 5));

        // Example 2: Multiple interface implementation
        System.out.println("\n2. SCIENTIFIC CALCULATOR (Multiple Interfaces):");
        System.out.println("------------------------------------------------");
        ScientificCalculator scientific = new ScientificCalculator();
        System.out.println("20 + 10 = " + scientific.add(20, 10));
        System.out.println("20 - 10 = " + scientific.subtract(20, 10));
        System.out.println("2 ^ 3 = " + scientific.power(2, 3));
        System.out.println("√16 = " + scientific.squareRoot(16));
        System.out.println("√25 = " + scientific.squareRoot(25));

        // Example 3: Vehicle interface implementation
        System.out.println("\n3. VEHICLE INTERFACE:");
        System.out.println("----------------------");
        Car car1 = new Car("Honda City");
        car1.start();
        car1.accelerate(40);
        car1.accelerate(30);
        car1.stop();

        System.out.println();
        Car car2 = new Car("Toyota Fortuner");
        car2.start();
        car2.accelerate(60);
        car2.stop();

        // Demonstrating polymorphism
        System.out.println("\n4. POLYMORPHISM WITH IMPLEMENTS:");
        System.out.println("---------------------------------");
        MathOperations calc1 = new BasicCalculator();
        MathOperations calc2 = new ScientificCalculator();

        System.out.println("Using BasicCalculator: 15 + 5 = " + calc1.add(15, 5));
        System.out.println("Using ScientificCalculator: 15 + 5 = " + calc2.add(15, 5));

        Vehicle vehicle = new Car("Maruti Swift");
        vehicle.start();
        vehicle.accelerate(50);
        vehicle.stop();

        System.out.println("\n=== KEY POINTS ===");
        System.out.println("1. 'implements' keyword is used to implement an interface");
        System.out.println("2. A class can implement multiple interfaces (separated by comma)");
        System.out.println("3. Class must provide implementation for all interface methods");
        System.out.println("4. Enables multiple inheritance functionality in Java");
        System.out.println("5. Used for achieving abstraction and polymorphism");
    }
}