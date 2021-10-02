package co.jjw.prc;

public class Exercise08 {

	public static void main(String[] args) {
		// % 연산 수행한 결과값에 +10. NaN (Not a number)값 검사

		double x = 5.0;
		double y = 0.0;
		double z = x % y;
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
	}

}
