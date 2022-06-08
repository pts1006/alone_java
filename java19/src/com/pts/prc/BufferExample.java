package com.pts.prc;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {

	public static void main(String[] args) {
		
		// Buffer의 위치 속성값
		System.out.println("[7바이트 크기로 버퍼 생성");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		printState(buffer);
		
		// 상대적 저장
		buffer.put((byte) 10);
		buffer.put((byte) 11);
		System.out.println("[2 바이트 저장후");
		printState(buffer);
		
		buffer.put((byte) 12);
		buffer.put((byte) 13);
		buffer.put((byte) 14);
		System.out.println("[3 바이트 저장후");
		printState(buffer);
		
		// 데이터를 읽기 위해 위치 속성값 변경
		buffer.flip();
		System.out.println("[flip() 실행후]");
		printState(buffer);
		
		buffer.get(new byte[3]);	// 상대적 읽기
		System.out.println("[3바이트 읽은후]");
		printState(buffer);
		
		buffer.mark();	// 마크하기
		System.out.println("--------[현재 위치를 마크 해놓음]");
		
		buffer.get(new byte[2]);
		System.out.println("2[바이트 읽은후]");
		printState(buffer);
		
		buffer.reset();	// 마크 위치로 position 이동
		System.out.println("--------[position을 마크 위치로 옮김]");
		
		buffer.rewind();
		System.out.println("[rewind() 실행후]");
		printState(buffer);
		
		buffer.clear();
		System.out.println("[clear() 실행후]");
		printState(buffer);
	}
	
	public static void printState(Buffer buffer) {
		
		System.out.print("\tposition: " + buffer.position() + ", ");
		System.out.print("\tlinit: " + buffer.limit() + ", ");
		System.out.println("\tcapacity: " + buffer.capacity());
	}
}
