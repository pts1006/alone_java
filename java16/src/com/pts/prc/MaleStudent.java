package com.pts.prc;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {

	private List<Student> list;	// 요소를 저장할 컬렉션
	
	public MaleStudent() {
		
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	public void accumulate(Student student) {
		// 요소를 수집하는 메소드
		
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	public void combine(MaleStudent other) {
		
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<Student> getList() {
		
		return list;
	}
}
