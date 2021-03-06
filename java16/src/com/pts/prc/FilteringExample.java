package com.pts.prc;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		// 필터링
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
		
		names.stream()
		.distinct()	// 중복 제거
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
		.filter(n -> n.startsWith("신"))	// 필터
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 중복 제거 후 필터
		names.stream()
		.distinct()
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));
	}
}
