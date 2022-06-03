package com.pts.prc;

import java.nio.ByteBuffer;

public class BufferSizeExample {
	
	public static void main(String[] args) {
		// 넌다이렉트와 다이렉트 크기 비교
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(200 * 1024 * 1024);
		System.out.println("다이렉트 버퍼가 생성되었습니다");
		
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(200 * 1024 * 1024);
		System.out.println("넌다이렉트 버퍼가 생성되었습니다");
	}
}
