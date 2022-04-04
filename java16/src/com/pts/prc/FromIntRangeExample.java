package com.pts.prc;

import java.util.stream.IntStream;

public class FromIntRangeExample {

	public static int sum;
	
	public static void main(String[] args) {
		// 정수 범위를 소스로 하는 스트림
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		
		System.out.println("총합: " + sum);
	}
}
