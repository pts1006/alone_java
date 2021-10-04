package javaPractice04;

public class Exercise06 {

	public static void main(String[] args) {
		// 삼각형

		String star = "*";
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
