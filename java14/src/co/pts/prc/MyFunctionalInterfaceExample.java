package co.pts.prc;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		// 람다식
		
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		System.out.println(fi.method(2,  5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		
		// return문만 있을 경우 중괄호와 return문 생략 가능
		fi = (x, y) ->  x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		
		return (x+ y);
	}
}
