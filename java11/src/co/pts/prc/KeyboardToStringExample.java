package co.pts.prc;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		// 바이트 배열을 문자열로 변환
		
		byte[] bytes = new byte[100];	// 읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);	// 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		
		String str = new String(bytes, 0, readByteNo - 2);	// 배열을 문자열로 변환. -2의 이유는 캐리지리턴(\r) + 라인피드(\n) 부분은 문자열로 만들 필요가 없기 때문
		System.out.println(str);
	}
}
