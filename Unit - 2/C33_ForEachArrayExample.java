// 33. Write a Java program to demonstrate the use of the for-each loop (enhanced for loop) to 
// traverse a one-dimensional array. 

public class C33_ForEachArrayExample {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };

		System.out.println("Array elements are:");
		for (int n : numbers) {
			System.out.println(n);
		}
	}
}