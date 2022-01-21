package co.pts.pra;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// 메인 스레드와 작업 스레드가 동시에 실행

		// 메인 메소드 바깥의 주석으로 대체 가능
		Thread thread = new BeepThread();
		
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	/* 11 라인 대체
	Thread thread = new Thread() {
		
		@Override
		public void run() {
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for (int i = 0; i< 5; i++) {
				
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	};
	*/
}
