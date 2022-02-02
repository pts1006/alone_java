package co.pts.prc;

public class WorkThread extends Thread {
	// InterruptedException이 발생할 때 스레드가 종료되도록
	
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {	// InterruptedException이 발생할될 때, while문을 빠져나와 스레드를 종료시킴
				System.out.println(getName() + "  interrupted");
				break;
			}
		}
		
		System.out.println(getName() + " 종료됨");
	}
}
