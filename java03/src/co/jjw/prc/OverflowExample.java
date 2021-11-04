package co.jjw.prc;

public class OverflowExample {

	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		System.out.println(z);	// 오버플로우
		
		long a = 10000000;
		long b = 10000000;
		long c = a * b;
		
		System.out.println(c);	// 오버플로우 해결
	}
}
