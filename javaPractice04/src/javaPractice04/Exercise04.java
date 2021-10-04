package javaPractice04;

public class Exercise04 {

	public static void main(String[] args) {
		// while문 + Math.random()이용. 주사위...
		/*
		  눈의 합이 5가 아니면 계속 주사위를 던지고
		  눈의 합이 5이면 실행을 멈추게
		*/

		int diceA = 0;
		int diceB = 0;
		
		while (diceA + diceB != 5) {
			diceA = (int) (Math.random() * 6) + 1;
			diceB = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + diceA + ", " + diceB + ")");
		}
		
	}

}
