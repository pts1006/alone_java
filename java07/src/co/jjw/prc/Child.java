package co.jjw.prc;

public class Child extends Parent {

	@Override
	public void method2() {
		// 재정의
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		
		System.out.println("Child-method3()");
	}
}
