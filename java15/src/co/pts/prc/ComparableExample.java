package co.pts.prc;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// 사용자 정의 객체를 나이 순으로 정렬하기
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
	}
}
