class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Moved the main method here so the program knows where to start!
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}

class Cat extends Animal2 {
    void sound() {
        System.out.println("Cat meows");
        super.sound(); // Calling parent class method
    }
}