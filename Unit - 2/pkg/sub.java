// sub class without package - for same directory usage
package pkg;

public class sub {
    int num1;
    int num2;
    
    // Constructor
    public sub(int a, int b) {
        num1 = a;
        num2 = b;
    }
    
    // Method to perform subtraction
    public int subtract() {
        return num1 - num2;
    }
    
    // Method to display result
    public void displaySubtraction() {
        System.out.println(num1 + " - " + num2 + " = " + subtract());
    }
    
    // Static method for direct subtraction
    public static int subtractNumbers(int a, int b) {
        return a - b;
    }
}

