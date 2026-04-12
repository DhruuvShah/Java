//4. Write a Java program to generate multiplication table. 

import java.util.Scanner;

public class C04_MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(+(n * i));
		}
		sc.close();
	}
}
