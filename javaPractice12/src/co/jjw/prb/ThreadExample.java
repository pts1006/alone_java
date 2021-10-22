package co.jjw.prb;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new MovieThread();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		thread.interrupt();
	}
}
