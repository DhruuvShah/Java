import java.util.Scanner; 
public class C9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter roll number: ");
		int rollNo = sc.nextInt();
		
		System.out.println("Student Name: " + name); 
		System.out.println("Roll Number: " + rollNo); 
		sc.close();
	}

}
