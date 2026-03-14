public class C30_StaticBlockDemo {
	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Initialization block");
	}

	C30_StaticBlockDemo(int y) {
		System.out.println("Within Parameterized Constructor");
	}

	C30_StaticBlockDemo() {
		System.out.println("Within Default Constructor");
	}

	public static void main(String[] args) {
		System.out.println("In main");
		C30_StaticBlockDemo st = new C30_StaticBlockDemo(100);
		System.out.println("-----------------------------------------");
		C30_StaticBlockDemo st1 = new C30_StaticBlockDemo();
	}

}