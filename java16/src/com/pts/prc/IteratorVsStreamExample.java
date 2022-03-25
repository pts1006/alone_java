package com.pts.prc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		// Iterator와 Stream 순차 처리 코드 비교
		
		List<String> list = Arrays.asList("홍길동", "신용권", "김자바");
		
		// Iterator 이용
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		// Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
