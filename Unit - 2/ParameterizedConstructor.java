// B. Program to demonstrate Parameterized Constructor

class Book {
    String title;
    String author;
    double price;

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        System.out.println("Parameterized Constructor called");
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        System.out.println("=== Parameterized Constructor Demo ===\n");

        // Creating objects with parameters
        Book book1 = new Book("Java Programming", "James Gosling", 599.99);
        book1.display();

        System.out.println("\n");

        Book book2 = new Book("Data Structures", "Mark Allen Weiss", 799.50);
        book2.display();
    }
}