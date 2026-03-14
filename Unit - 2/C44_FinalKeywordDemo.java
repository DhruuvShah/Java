public class C44_FinalKeywordDemo {
	public static void main(String[] args) {
		final int a = 3; // Declaring a final variable

		// a = 5; // This will result in a compile-time error

		System.out.println("Value of A: " + a);

		final String name = "Nisha";
		// name = "Heli"; // This will also result in a compile-time error

		System.out.println("Name: " + name);
	}

}