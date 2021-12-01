package co.pts.prc;

public class ThrowsExample {
/* 예외 처리 떠넘기기 */
    public static void main(String[] args) {

        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException {

        Class clazz = Class.forName("java.lang.String2");
    }
}

/* 
    Class.forName(): 자바 리플렉션 API의 일부. 자바 리플렉션 API란 간단히 말해서
    구체적인 클래스의 타입을 알지 못해도 클래스의 변수 및 메소드 등에 접근하게 해 주는 API
    (동적 바인딩)
    매개값으로 주어진 클래스가 존재하면 Class 객체를 리턴하지만,
    존재하지 않으면 ClassNotFoundException 예외를 발생시킨다.

    리플렉션은 실행중인 자바 프로그램 내부를 검사하고 내부의 속성을 수정할 수 있도록 해 줌.
        자바 클래스 파일들은 바이트 코드로 컴파일 되어
        static과 함께 method 영역에 저장되어 지기 때문에
        클래스 이름만 알면 클래스의 정보를 찾을 수 있다.
*/
