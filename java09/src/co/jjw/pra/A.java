package co.jjw.pra;

public class A {
    // 바깥 필드와 메소드에서 사용 제한

    // 인스턴스 필드
    B field1 = new B();
    C field2 = new C();

    // 인스턴스 메소드
    void method1() {
        
        B var1 = new B();
        C var2 = new C();
    }

    // 정적 필드 초기화
    // static B field3 = new B();
    static C field4 = new C();

    // 정적 메소드
    static void method2() {

        // B var1 = new B();
        C var2 = new C();
    }

    // 인스턴스 멤버 클래스
    class B {}

    // 정적 멤버 클래스
    static class C {}

    /* 
        정적 멤버 클래스(C)는 모든 필드의 초기값이나 모든 메소드에서 객체를 생성할 수 있다.
        인스턴스 멤버 클래스(B)는 바깥 클래스의 인스턴스 필드(field1)의 초기값이나 인스턴스 메소드(method1())에서 객체를 생성할 수 있으나,
        정적 필드(field3)의 초기값이나 정적 메소드(method2())에서는 객체를 생성할 수 없다.
    */
}
