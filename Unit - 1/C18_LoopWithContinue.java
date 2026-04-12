//18. write a java program to print 1 to 10 but use continue Statement.

public class C18_LoopWithContinue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
