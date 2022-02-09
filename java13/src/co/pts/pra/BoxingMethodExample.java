package co.pts.pra;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// 제네릭 메소드 호출

		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		
		System.out.println(intValue);
		System.out.println(strValue);
	}

}
