public class C31_OneDArrayExample {
	public static void main(String[] args) {

		// int marks[] = {60, 58, 50, 78, 89};
		int[] marks = new int[5];

		marks[0] = 80;
		marks[1] = 85;
		marks[2] = 78;
		marks[3] = 90;
		marks[4] = 88;

		System.out.println("Marks are:");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
}