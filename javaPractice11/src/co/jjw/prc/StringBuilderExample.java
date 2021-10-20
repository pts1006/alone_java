package co.jjw.prc;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String str = "";
		
		for (int i = 1; i <= 100; i++) {
			str += i;
		}
		
		System.out.println(str);
		
		// 100개 이상의 String 객체를 생성하는 결과를 만들기 때문에 좋은 코드라고 볼 수 없음
		
		// 개선 코드 작성 위치
		StringBuilder strBuilder = new StringBuilder();
		
		for (int i = 1; i <= 100; i++) {
			strBuilder.append(i);
		}
		
		System.out.println(strBuilder);
	}
}
