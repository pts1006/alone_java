package co.pts.pra;

public class StatePrintThread extends Thread {	// 타겟 스레드의 상태를 출력하는 스레드

	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {

		this.targetThread = targetThread;
	}

	public void run() {

		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);

			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			if (state == Thread.State.TERMINATED) {
				break;
			}

			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
