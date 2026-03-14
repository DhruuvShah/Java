public class C29_StaticVariableDemo {
	int a = 0;
	static int b = 0;

	public static void main(String[] args) {
		C29_StaticVariableDemo obj1 = new C29_StaticVariableDemo();
		C29_StaticVariableDemo obj2 = new C29_StaticVariableDemo();

		obj1.a = 10;
		obj2.a = 20;
		System.out.println("object 1 : Instance variable: " + obj1.a);
		System.out.println("object 2 : Instance variable: " + obj2.a);

		obj1.b = 7;
		System.out.println("object 1 : Static :" + obj1.b);
		System.out.println("object 2 : Static :" + obj2.b);

		b++;
		System.out.println("After Increment");
		System.out.println("object 1 : Static :" + obj1.b);
		System.out.println("object 2 : Static :" + obj2.b);
	}
}