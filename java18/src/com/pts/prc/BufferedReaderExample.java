package com.pts.prc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		// 콘솔로부터 라인 단위로 읽기
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);	// 버퍼 스트림 생성
		
		System.out.print("입력: ");
		String lineString = br.readLine();
		
		System.out.println("출력: " + lineString);
	}
}
