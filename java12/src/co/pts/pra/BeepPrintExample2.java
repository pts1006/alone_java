package co.pts.pra;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// 메인 스레드와 작업 스레드가 동시에 실행
		
		// 11 ~ 12 라인은 메인 메소드 바깥의 주석들로 대체 가능
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);

		
		thread.start();	// BeepRunnable
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	// Runnable 익명 객체 이용
	/*
	Thread thread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for (int i = 0; i < 5; i++) {
				
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	});
	*/
	
	// 람다식 이용
	/*
	Thread thread = new Thread(() -> {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	});
	*/
}
