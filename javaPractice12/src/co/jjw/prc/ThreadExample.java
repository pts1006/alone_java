package co.jjw.prc;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new MovieThread();
		thread.setDaemon(true);	// 데몬스레드 : 메인스레드가 종료되면 자동으로 같이 종료된다
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
	}
}
