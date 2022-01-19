package co.pts.pra;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 메인 스레드만 이용한 경우
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	// Toolkit 객체 얻기
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();		// 비프음 발생
			try { 
				Thread.sleep(500);	// 0.5초간 일시 정지
			} catch (Exception e) {
				
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}

	}

	
	// Project menu > Properties > Java Compiler > Compiler compliance level > 11
	/*
	49 = Java 5
	50 = Java 6
	51 = Java 7
	52 = Java 8
	53 = Java 9
	54 = Java 10
	55 = Java 11
	56 = Java 12
	57 = Java 13
	58 = Java 14
	*/
}
