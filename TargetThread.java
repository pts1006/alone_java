package co.pts.pra;

public class TargetThread extends Thread {	// 타겟 스레드

	public void run() {
		
		for (long i = 0; i < 1000000000; i++) {
			
		}
		
		try {
			Thread.sleep(1500);	// 1.5초간 일시 정지
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (long i = 0; i < 1000000000; i++) {
			
		}
	}
}
