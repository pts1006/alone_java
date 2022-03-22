package co.pts.prc;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// 내림차순 정렬자를 사용하는 TreeSet

		/*
		 * Fruit이 Coparable을 구현하지 않았기 때문에 예외 발생
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		*/
		
		// 내림차순 정렬자 제공
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		
		// 저장될 때 가격을 기준으로 내림차순 정렬됨
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}

}
