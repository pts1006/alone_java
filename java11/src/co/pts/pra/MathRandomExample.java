package co.pts.pra;

public class MathRandomExample {

	public static void main(String[] args) {
		// 임의의 주사위의 눈 얻기

		int num = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 눈: " + num);
	}

}
