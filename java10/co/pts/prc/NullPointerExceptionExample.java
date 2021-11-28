package co.pts.prc;

public class NullPointerExceptionExample {
/* NullPointerException이 발생하는 경우 */ 
    public static void main(String[] args) {

        String data = null;     // data변수가 null 값을 가지고 있기 때문에 String 객체를 참조하고 있지 않다.
        System.out.println(data.toString());    // 그런데 여기서 String 객체의 toString() 메소드를 호출해 버림
    }
}
