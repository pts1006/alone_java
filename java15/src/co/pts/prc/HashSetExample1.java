package co.pts.prc;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		// String 객체를 중복 없이 저장하는 HashSet
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("SErvlet/JSP");
		set.add("Java");	// "Java"가 한 번만 저장됨을 알 수 있다
		set.add("iBATIS");
		
		int size = set.size();	// 저장된 객체 수 얻기
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();	// 반복자 얻기
		while (iterator.hasNext()) {	// 객체 수만큼 루핑
			String element = iterator.next();	// 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}
		
		set.remove("JBDC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();	// 모든 객체를 제거하고 비움
		
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}

