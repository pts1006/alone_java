package co.jjw.prc;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------------------");
				System.out.println("1.증속 | 2.감속 | 3. 중지");
				System.out.println("--------------------------------");
				System.out.print("선택: ");
				
			}
			
			keyCode = System.in.read();	// 키보드의 키 코드를 읽음
			
			if (keyCode == 49) {	// 1일 경우
				speed++;
				System.out.println("현재 속도= " + speed);
			} else if (keyCode == 50) {	// 2일 경우
				speed--;
				System.out.println("현재 속도= " + speed);
			} else if (keyCode == 51) {	// 3일 경우
				run = false;	// while문을 종료하기 위해 run 변수에 false를 저장
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
