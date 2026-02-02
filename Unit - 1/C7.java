import java.util.Scanner;

public class C7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		
		System.out.print("Enter second number:\n");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Sum is " +sum);
		sc.close();
	}

}
