// G. Program to demonstrate the "final" keyword

class FinalDemo {
    // final variable (constant)
    final int MAX_VALUE = 100;
    
    // final method
    final void displayMaxValue() {
        System.out.println("Maximum Value: " + MAX_VALUE);
    }
    
    void showExample() {
        // Trying to change final variable will cause compilation error
        // MAX_VALUE = 200;  // Uncommenting this will cause error
        
        final int LOCAL_CONSTANT = 50;
        System.out.println("Local Final Variable: " + LOCAL_CONSTANT);
        
        // LOCAL_CONSTANT = 60;  // Uncommenting this will cause error
    }
}

class ChildDemo extends FinalDemo {
    // Trying to override final method will cause compilation error
    // void displayMaxValue() {  // Uncommenting this will cause error
    //     System.out.println("Trying to override");
    // }
    
    void display() {
        System.out.println("This is child class method");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println("=== Final Keyword Demo ===\n");
        
        // 1. Final variable demonstration
        System.out.println("1. Final Variable Example:");
        FinalDemo obj1 = new FinalDemo();
        obj1.displayMaxValue();
        obj1.showExample();
        
        // 2. Final method demonstration
        System.out.println("\n2. Final Method Example:");
        ChildDemo obj2 = new ChildDemo();
        obj2.displayMaxValue();  // Can call but cannot override
        obj2.display();
        
        // 3. Final reference variable
        System.out.println("\n3. Final Reference Variable:");
        final FinalDemo obj3 = new FinalDemo();
        obj3.displayMaxValue();
        
        // obj3 = new FinalDemo();  // Cannot reassign - compilation error
        // But we can modify the object's state (if it's not final)
        System.out.println("Final reference cannot be reassigned but object can be modified");
        
        // 4. Final parameter demonstration
        System.out.println("\n4. Final Parameter Example:");
        methodWithFinalParameter(42);
        
        System.out.println("\nKey Points:");
        System.out.println("- Final variable: Cannot be changed once initialized");
        System.out.println("- Final method: Cannot be overridden in subclass");
        System.out.println("- Final class: Cannot be inherited (see next program)");
    }
    
    static void methodWithFinalParameter(final int value) {
        System.out.println("Final parameter value: " + value);
        // value = 100;  // Cannot modify final parameter - compilation error
    }
}