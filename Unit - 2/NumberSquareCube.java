// E. Program with Number, Square, and Cube classes

// Base Class
class Number {
    int x;
    
    Number(int num) {
        x = num;
    }
    
    void displayNumber() {
        System.out.println("Number: " + x);
    }
}

// Derived Class 1 - prints square
class Square extends Number {
    
    Square(int num) {
        super(num);  // Call parent constructor
    }
    
    void printSquare() {
        System.out.println("Square of " + x + " = " + (x * x));
    }
}

// Derived Class 2 - prints cube
class Cube extends Square {
    
    Cube(int num) {
        super(num);  // Call parent constructor
    }
    
    void printCube() {
        System.out.println("Cube of " + x + " = " + (x * x * x));
    }
    
    void displayAll() {
        displayNumber();
        printSquare();
        printCube();
    }
}

public class NumberSquareCube {
    public static void main(String[] args) {
        System.out.println("=== Number, Square, Cube Demo ===\n");
        
        System.out.println("Example 1:");
        Cube num1 = new Cube(5);
        num1.displayAll();
        
        System.out.println("\nExample 2:");
        Cube num2 = new Cube(10);
        num2.displayAll();
        
        System.out.println("\nExample 3:");
        Cube num3 = new Cube(3);
        num3.displayAll();
        
        // We can also use Square class to get only square
        System.out.println("\nUsing Square class only:");
        Square num4 = new Square(7);
        num4.displayNumber();
        num4.printSquare();
    }
}