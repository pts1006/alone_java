package co.jjw.prc;

public class Exercise07 {

	public static void main(String[] args) {
		// for문 사용 최대값
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
	}

}
