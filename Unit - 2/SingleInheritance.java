// C. Program to demonstrate Single Inheritance

// Parent Class (Base Class)
class Animal {
    String name;

    void setName(String n) {
        name = n;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child Class (Derived Class)
class Dog extends Animal {
    String breed;

    void setBreed(String b) {
        breed = b;
    }

    void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance Demo ===\n");

        Dog myDog = new Dog();

        // Using inherited methods from Animal class
        myDog.setName("Buddy");
        myDog.setBreed("Golden Retriever");

        myDog.displayInfo();
        System.out.println();

        myDog.eat(); // Inherited method
        myDog.sleep(); // Inherited method
        myDog.bark(); // Own method
    }
}