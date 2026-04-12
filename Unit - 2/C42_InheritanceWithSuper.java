// 42. Write a Java program to demonstrates the use of super keyword to invoke a parent class 
// method from a child class.

class C42_InheritanceWithSuper {
	void sound() {
		System.out.println("Animal makes a sound");
	}

	// Moved the main method here so the program knows where to start!
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
	}
}

class Cat extends C42_InheritanceWithSuper {
	void sound() {
		System.out.println("Cat meows");
		super.sound(); // Calling parent class method
	}
}