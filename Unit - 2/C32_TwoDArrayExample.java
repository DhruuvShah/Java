public class C32_TwoDArrayExample {

	public static void main(String[] args) {

		// int matrix[][] = {{2, 3, 6}, {9, 3, 3}, {2,5,6}};
		int[][] matrix = new int[3][3];

		matrix[0][0] = 10;
		matrix[0][1] = 20;
		matrix[0][2] = 30;
		matrix[1][0] = 40;
		matrix[1][1] = 50;
		matrix[1][2] = 60;
		matrix[2][0] = 70;
		matrix[2][1] = 80;
		matrix[2][2] = 90;

		System.out.println("2D Array elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
