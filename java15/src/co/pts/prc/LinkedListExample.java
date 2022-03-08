package co.pts.prc;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// ArrayList와 LinkedList의 실행 성능 비교
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		
		/*
		구분			순차적으로 추가/삭제		중간에 추가/삭제		검색
		ArrayList	빠르다				느리다				빠르다
		LinekdList	느리다				빠르다				느리다
		*/
	}
}
