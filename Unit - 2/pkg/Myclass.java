// Myclass without package - for same directory usage
package pkg;

public class Myclass {
    // Method to display a message
    public void displayMessage() {
        System.out.println("Hello from Myclass!");
    }
    
    // Method to greet a person
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Method to calculate factorial
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Method to check if number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}