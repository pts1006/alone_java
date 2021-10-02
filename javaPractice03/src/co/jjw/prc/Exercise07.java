package co.jjw.prc;

public class Exercise07 {

	public static void main(String[] args) {
		// 비교 연산자와 논리 연산자 복합 연산식

		int x = 10;
		int y = 5;
		
		System.out.println( (x > 7 ) && (y <= 5) );
							// o			o
		
		System.out.println( (x % 3 == 2) || (y % 2 != 1) );
							// x				x
	}

}
