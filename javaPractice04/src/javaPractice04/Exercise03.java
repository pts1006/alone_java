package javaPractice04;

public class Exercise03 {

	public static void main(String[] args) {
		// for문 이용. 1 ~ 100까지의 정수 중 3의 배수의 총합

		int result = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				result = result + i;
			}
		}
		
		System.out.println("3의 배수의 합 : " + result);
	}

}
