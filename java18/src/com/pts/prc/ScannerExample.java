package com.pts.prc;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 문자열 정수 실수를 직접 읽는 예제
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("정수 입력> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("실수 입력> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		
		scanner.close();
	}

}
