package co.pts.prc;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();	// 동전케이스에서 제일 위의 동전 꺼내기 (객체를 스택에서 제거)
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}
}
