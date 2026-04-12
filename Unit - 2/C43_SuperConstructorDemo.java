// 43.  This Java program demonstrates the use of the super() constructor call to invoke a parent 
// class constructor from a child class constructor. 

class SuperClass {
	SuperClass() {
		System.out.println("Super Class Constructor");
	}
}

public class C43_SuperConstructorDemo extends SuperClass {
	C43_SuperConstructorDemo() {
		super();
		System.out.println("Sub Class Constructor");
	}

	public static void main(String[] args) {
		C43_SuperConstructorDemo m = new C43_SuperConstructorDemo();
	}
}