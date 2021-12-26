package co.pts.prc;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder에서 문자열 조작
		StringBuilder sb = new StringBuilder();	// StringBuilder 객체 생성

		/* 문자열 끝에 추가 */
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4,  "2");	// index 4 위치 뒤에 2를 삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');	// index 4 위치의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");	// index 6부터 index 13 '전'까지를 "Book" 문자열로 대치
		System.out.println(sb.toString());

		sb.delete(4, 5);	// index 4부터 index5 '전'까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString();	// 버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);
		
	}

}
