package co.pts.pra;

public class PriorityExample {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			Thread thread = new CalcThread("thread" + i);
			
			if (i != 0) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
	}
}
