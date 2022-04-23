package com.pts.prc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		// 그루핑 후 리덕션
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Gender.MALE),
			new Student("김수애", 12, Student.Gender.FEMALE),
			new Student("신용권", 10, Student.Gender.MALE),
			new Student("박수미", 12, Student.Gender.FEMALE)
		);
		
		// 성별로 평균 점수를 저장하는 Map 얻기
		Map<Student.Gender, Double> mapByGender = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student :: getGender,
					Collectors.averagingDouble(Student :: getScore)
				)
			);
			
		System.out.println("남학생 평균 점수: " + mapByGender.get(Student.Gender.MALE));
		System.out.println("여학생 평균 점수: " + mapByGender.get(Student.Gender.FEMALE));
		
		// 성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<Student.Gender, String> mapByName = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student :: getGender, 
					Collectors.mapping(
						Student :: getName, 
						Collectors.joining(",")
					)
				)
			);
			
		System.out.println("남학생 전체 이름: " + mapByName.get(Student.Gender.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(Student.Gender.FEMALE));
		
	}

}
