//17. write a java program to print 1 to 10 but use break Statement. 

public class C17_LoopWithBreak {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.print(i + " ");
		}
	}

}
