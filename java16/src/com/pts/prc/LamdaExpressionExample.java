package com.pts.prc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionExample {

	public static void main(String[] args ) {
		// 요소 처리를 위한 람다식
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("신용권", 92)
		);
		
		Stream<Student> stream = list.stream();
		
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}
