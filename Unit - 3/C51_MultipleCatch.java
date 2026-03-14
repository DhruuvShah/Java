import java.util.Scanner;

public class C51_MultipleCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.print("Enter index (0 to 4): ");
		int index = sc.nextInt();

		try {
			if (index < 0) {
				throw new IllegalArgumentException("Negative index is not allowed.");
			}

			// This may throw ArrayIndexOutOfBoundsException
			System.out.println("Element at index " + index + " is: " + arr[index]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Index exceeds array size.");
		}

		catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("Program continues normally...");
	}
}