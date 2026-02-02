// O. Program to demonstrate Package mechanism
// VERSION: All files in same directory (no packages)
// package Myclass;
package pkg;
// package sum;
// package sub;

public class PackageDemo {
    public static void main(String[] args) {
        System.out.println("=== PACKAGE DEMONSTRATION (Same Directory Version) ===\n");

        // Using Myclass
        System.out.println("1. USING Myclass:");
        System.out.println("----------------------");
        Myclass myObj = new Myclass();
        myObj.displayMessage();
        myObj.greet("Student");

        System.out.println("Factorial of 5: " + myObj.factorial(5));
        System.out.println("Is 17 prime? " + myObj.isPrime(17));
        System.out.println("Is 20 prime? " + myObj.isPrime(20));

        // Using sum
        System.out.println("\n2. USING sum class:");
        System.out.println("------------------------");
        sum addition1 = new sum(25, 15);
        addition1.displaySum();

        sum addition2 = new sum(100, 50);
        addition2.displaySum();

        // Using static method
        System.out.println("Using static method: 45 + 30 = " + sum.addNumbers(45, 30));

        // Using sub
        System.out.println("\n3. USING sub class:");
        System.out.println("------------------------");
        sub subtraction1 = new sub(50, 20);
        subtraction1.displaySubtraction();

        sub subtraction2 = new sub(100, 35);
        subtraction2.displaySubtraction();

        // Using static method
        System.out.println("Using static method: 75 - 25 = " + sub.subtractNumbers(75, 25));

        // Combined operations
        System.out.println("\n4. COMBINED OPERATIONS:");
        System.out.println("------------------------");
        int a = 80, b = 30;
        sum s = new sum(a, b);
        sub sub1 = new sub(a, b);

        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);
        s.displaySum();
        sub1.displaySubtraction();

        System.out.println("\n5. MULTIPLE CALCULATIONS:");
        System.out.println("--------------------------");
        int[] numbers1 = { 10, 20, 30, 40, 50 };
        int[] numbers2 = { 5, 10, 15, 20, 25 };

        System.out.println("Addition Results:");
        for (int i = 0; i < numbers1.length; i++) {
            sum temp = new sum(numbers1[i], numbers2[i]);
            temp.displaySum();
        }

        System.out.println("\nSubtraction Results:");
        for (int i = 0; i < numbers1.length; i++) {
            sub temp = new sub(numbers1[i], numbers2[i]);
            temp.displaySubtraction();
        }

        System.out.println("\n=== NOTE ===");
        System.out.println("This version works without package structure.");
        System.out.println("All files are in the same directory.");
    }
}