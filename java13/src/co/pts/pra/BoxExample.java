package co.pts.pra;

public class BoxExample {

	public static void main(String[] args) {
		// 제네릭 타입 이용

		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer>box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		
		System.out.println(str);
		System.out.println(value);
	}

}
