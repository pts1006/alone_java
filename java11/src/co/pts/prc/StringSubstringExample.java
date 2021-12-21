package co.pts.prc;

public class StringSubstringExample {

	public static void main(String[] args) {
		// 문자열 추출하기
		String ssn = "880815-1234567 ";
		
		String firstNum = ssn.substring(0, 6);	// 0(포함) ~ 6(제외) 사이의 문자열 추출
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// 7부터의 문자열 추출
		System.out.println(secondNum);

	}

}
