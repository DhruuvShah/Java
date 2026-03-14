public class C23_MethodOverloading {
	static void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}

	static void addition(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum = " + sum);
	}

	static void addition(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		addition(10, 20);
		addition(10, 20, 30);
		addition(10, 20, 30, 40);
	}

}