public class C28_AdditionOverloading {

	C28_AdditionOverloading(int a, int b) {
		int sum = a + b;
		System.out.println("Sum: " + sum);
	}

	C28_AdditionOverloading(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum: " + sum);
	}

	C28_AdditionOverloading(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {

		C28_AdditionOverloading obj1 = new C28_AdditionOverloading(10, 20);
		C28_AdditionOverloading obj2 = new C28_AdditionOverloading(1, 2, 3);
		C28_AdditionOverloading obj3 = new C28_AdditionOverloading(1, 2, 3, 4);
	}
}