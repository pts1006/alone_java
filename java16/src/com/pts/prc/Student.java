package com.pts.prc;

public class Student implements Comparable<Student> {

	public enum Gender {MALE, FEMALE}
	public enum City {Seoul, Pusan}
	
	private String name;
	private int score;
	private Gender gender;
	private City city;
	
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	
	public Student(String name, int score, Gender gender) {
		
		this.name = name;
		this.score = score;
		this.gender = gender;
	}
	
	public Student(String name, int score, Gender gender, City city) {
		
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	public Gender getGender() { return gender; }
	public City getCity() { return city; }
	
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(score, o.score);
//		score < o.score: 음수 리턴
//		score == o.score: 0리턴
//		score > o.score: 양수 리턴
	}
	
	
}
