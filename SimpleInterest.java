import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Principal (P): ");
		double p = sc.nextDouble();
		System.out.print("Enter Rate of Interest (R): ");
		double r = sc.nextDouble();
		System.out.print("Enter Number of Years (N): ");
		double n = sc.nextDouble();
		double si = (p * r * n) / 100;

		System.out.println("Simple Interest = " + si);
		sc.close();
	}
}