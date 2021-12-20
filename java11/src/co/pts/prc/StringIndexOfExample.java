package co.pts.prc;

public class StringIndexOfExample {

	public static void main(String[] args) {
		/* 문자열 포함 여부 조사 */
		String subject = "자바 프로그래밍";
						//01 2 34567
		int location = subject.indexOf("프로그래밍");	// 문자열이 포함되어 있지 않으면 -1을 리턴
		System.out.println(location);
		
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련없는 책");
		}
	
	}
}
