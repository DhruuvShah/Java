// 50. Write a Java program that initializes an array of five integers. Take an 
// index as input from the user and print the corresponding array 
// element. Handle the ArrayIndexOutOfBoundsException if an attempt is 
// made to access an element beyond the array's bounds.

import java.util.Scanner;

public class C50_ArrayExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Initialize array of 5 integers
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.print("Enter index (0 to 4): ");
		int index = sc.nextInt();

		try {
			System.out.println("Element at index " + index + " is: " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Invalid index! Please enter index between 0 and 4.");
		}

		System.out.println("Program continues normally...");
		sc.close();
	}
}