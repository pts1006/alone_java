package co.pts.prc;

public class DataBox {

	private String data;
	
	public synchronized String getData() {
		
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		
		// data 필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듦
		data = null;
		notify();
		
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}

		// data 필드에 값을 저장하고 소비자 스레드를 실행 대기 상태로 만듦
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();
		
	}
}
