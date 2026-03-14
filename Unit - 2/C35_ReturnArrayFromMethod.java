public class C35_ReturnArrayFromMethod {
	static int[] createArray() {
		int[] arr = { 10, 20, 30, 40, 500 };
		return arr; // Return the array
	}

	public static void main(String[] args) {
		int[] arr = createArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}