package co.pts.prc;

public class RunnableExample {

	public static void main(String[] args) {
		// 함수적 인터페이스와 람다식

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
	}
	
//	Thread thread = new Thread(() -> {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//	});
}
