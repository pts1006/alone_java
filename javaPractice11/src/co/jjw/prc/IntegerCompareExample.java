package co.jjw.prc;

public class IntegerCompareExample {

	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		/*
		int 값이 -128 ~ 127 사이일 경우에는 내부 값을 비교 가능하지만,
		그 범위를 벗어나면 객체의 번지를 비교하기 때문에
		다른 결과가 나옴
		*/
	}
}
