// J. Program to demonstrate "abstract" keyword for Class

// Abstract class
abstract class Animal {
    String name;
    int age;

    // Constructor
    Animal(String n, int a) {
        name = n;
        age = a;
    }

    // Abstract methods (must be implemented by subclasses)
    abstract void makeSound();

    abstract void move();

    // Concrete method (has implementation)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }

    void sleep() {
        System.out.println(name + " is sleeping... Zzz");
    }
}

// Concrete class 1
class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    @Override
    void move() {
        System.out.println(name + " runs on four legs");
    }

    void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Concrete class 2
class Cat extends Animal {
    boolean isIndoor;

    Cat(String name, int age, boolean indoor) {
        super(name, age);
        isIndoor = indoor;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }

    @Override
    void move() {
        System.out.println(name + " walks gracefully on four legs");
    }

    void displayType() {
        if (isIndoor) {
            System.out.println("Type: Indoor cat");
        } else {
            System.out.println("Type: Outdoor cat");
        }
    }
}

// Concrete class 3
class Bird extends Animal {
    double wingspan;

    Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp! Chirp!");
    }

    @Override
    void move() {
        System.out.println(name + " flies in the sky");
    }

    void displayWingspan() {
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Demo ===\n");

        // Cannot instantiate abstract class
        // Animal animal = new Animal("Generic", 5); // This will cause error

        System.out.println("1. DOG EXAMPLE:");
        System.out.println("----------------");
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.displayBreed();
        dog.makeSound();
        dog.move();
        dog.sleep();

        System.out.println("\n2. CAT EXAMPLE:");
        System.out.println("----------------");
        Cat cat = new Cat("Whiskers", 2, true);
        cat.displayInfo();
        cat.displayType();
        cat.makeSound();
        cat.move();
        cat.sleep();

        System.out.println("\n3. BIRD EXAMPLE:");
        System.out.println("----------------");
        Bird bird = new Bird("Tweety", 1, 0.3);
        bird.displayInfo();
        bird.displayWingspan();
        bird.makeSound();
        bird.move();
        bird.sleep();

        System.out.println("\n4. POLYMORPHISM WITH ABSTRACT CLASS:");
        System.out.println("-------------------------------------");
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Max", 4, "Labrador");
        animals[1] = new Cat("Mittens", 3, false);
        animals[2] = new Bird("Eagle", 5, 2.0);

        for (Animal a : animals) {
            System.out.println("\nAnimal: " + a.name);
            a.makeSound();
            a.move();
        }

        System.out.println("\n=== KEY FEATURES OF ABSTRACT CLASS ===");
        System.out.println("1. Cannot create instance of abstract class");
        System.out.println("2. Can have both abstract and concrete methods");
        System.out.println("3. Can have constructors and instance variables");
        System.out.println("4. Subclasses must implement all abstract methods");
        System.out.println("5. Can be used for polymorphism");
    }
}