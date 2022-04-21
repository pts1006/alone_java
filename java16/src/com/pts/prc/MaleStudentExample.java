package com.pts.prc;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {

	public static void main(String[] args) {
		// 남학생을 MaleStudent에 누적

		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Gender.MALE),
			new Student("김수애", 6, Student.Gender.FEMALE),
			new Student("신용권", 10, Student.Gender.MALE),
			new Student("박수미", 6, Student.Gender.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
			.filter(s -> s.getGender() == Student.Gender.MALE)
			.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
