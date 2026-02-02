// sum class without package - for same directory usage
package pkg;

public class sum {
    int num1;
    int num2;
    
    // Constructor
    public sum(int a, int b) {
        num1 = a;
        num2 = b;
    }
    
    // Method to perform addition
    public int add() {
        return num1 + num2;
    }
    
    // Method to display result
    public void displaySum() {
        System.out.println(num1 + " + " + num2 + " = " + add());
    }
    
    // Static method for direct addition
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}