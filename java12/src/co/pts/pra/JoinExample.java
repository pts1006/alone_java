package co.pts.pra;

public class JoinExample {

	public static void main(String[] args) {
		// 다른 스레드가 종료될 때까지 일시 정지 상태 유지
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();	// sumThrad가 종료할때까지 메인 스레드를 일시 정지시킴
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("1 ~ 100 합: " + sumThread.getSum());
	}

}
