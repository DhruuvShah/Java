// A. Program to demonstrate Default Constructor

class Student {
    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
        System.out.println("Default Constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        System.out.println("=== Default Constructor Demo ===\n");

        // Creating object - default constructor will be called
        Student student1 = new Student();
        student1.display();

        System.out.println("\nCreating another object:");
        Student student2 = new Student();
        student2.display();
    }
}