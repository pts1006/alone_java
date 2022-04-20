package com.pts.prc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		// 필터링해서 새로운 컬렉션 생성
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Gender.MALE),
			new Student("김수애", 6, Student.Gender.FEMALE),
			new Student("신용권", 10, Student.Gender.MALE),
			new Student("박수미", 6, Student.Gender.FEMALE)
		);
		
		// 남학생들만 묶어 List 생성
		List<Student> maleList
			= totalList.stream()
				.filter(s -> s.getGender() == Student.Gender.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// 여학생들만 묶어 HashSet 생성
		Set<Student> femaleSet
			= totalList.stream()
				.filter(s -> s.getGender() == Student.Gender.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
