// 45. Java program demonstrates the use of the final keyword to prevent method overriding.

class FinalMethodClass {
	final void method1() {
		System.out.println("This is method 1");
	}
}

public class C45_FinalMethodDemo extends FinalMethodClass {

	public static void main(String args[]) {
		FinalMethodClass obj = new FinalMethodClass();
		obj.method1();
	}
	/*
	 * void method1() { System.out.println("Overriding method"); }
	 */
}