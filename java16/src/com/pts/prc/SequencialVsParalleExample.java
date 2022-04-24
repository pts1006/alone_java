package com.pts.prc;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParalleExample {

	// 요소 처리
	public static void work(int value) {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	// 순차 처리
	public static long testSequencial(List<Integer> list) {
		
		long start = System.nanoTime();
		list.stream().forEach((a) -> work(a));
		
		long end = System.nanoTime();
		long runTime = end - start;
		
		return runTime;
	}
	
	// 병렬 처리
	public static long testParallel(List<Integer> list) {
		
		long start = System.nanoTime();
		list.stream().parallel().forEach((a) -> work(a));
		
		long end = System.nanoTime();
		long runTime = end - start;
		
		return runTime;
	}
	
	// 순차 처리와 병렬 처리 성능 비교	
	public static void main(String... args) { // ellipsis

		// 소스 컬렉션
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8 ,9);
		
		// 순차 스트림 처리 시간 구하기
		long timeSequencial = testSequencial(list);
		
		// 병렬 스트림 처리 시간 구하기
		long timeParallel = testParallel(list);
		
		if (timeSequencial < timeParallel) {
			System.out.println("성능 테스트 결과: 순차 처리가 더 빠름");
		} else {
			System.out.println("성능 테스트 결과: 병렬 처리가 더 빠름");
		}
		
	}

}
