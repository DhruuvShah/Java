import java.util.Scanner;
public class StudentPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter College Name:");
		String college = sc.nextLine();
		
		System.out.println("Enter Stream:");
		String stream = sc.nextLine();
		
		System.out.println("Enter Roll Number:");
		long roll = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name:");
		String name = sc.nextLine();
		
		int total  = 0;
		
		for(int i=0; i <=6; i++) {
			System.out.println("Enter Marks Of Subject " + i + ":");
			int marks = sc.nextInt();
			total += marks;
		}
		
		double percentage = total / 6.0;
		
		System.out.println("----- Student Result -----");
		System.out.println("College Name:" + college);
		System.out.println("Stream:" + stream);
		System.out.println("Roll No:" + roll);
		System.out.println("Student Name:" + name);
		System.out.println("Total Marks:" + total);
		System.out.println("Percentage:" + percentage);
		sc.close();
	}
}
