package co.jjw.prc;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		
		String str = "아이디,이름,패스워드";
		
		// 방법1 (split() 메소드 이용)
		String[] sp = str.split(",");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(sp[2]);
		
		/* 반복문 이용
		for (int i = 0; i < sp.length; i++) {
		 	System.out.println(sp[i]);
		}
		*/
				
		System.out.println();
		
		// 방법2 (StringTokenizer 이용)
		StringTokenizer token = new StringTokenizer(str, ",");
		
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
	}
}
