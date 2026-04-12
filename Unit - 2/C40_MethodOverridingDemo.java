// 40. Write a Java program to demonstrates the concept of method overriding.

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

public class C40_MethodOverridingDemo {
	public static void main(String[] args) {
		Animal a = new Dog(); // Upcasting
		a.sound(); // Calls Dog's method
	}
}