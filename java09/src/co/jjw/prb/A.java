package co.jjw.prb;

public class A {
    // 멤버 클래스에서 사용 제한
    
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B {   // 인스턴스 멤버 클래스는 모든 필드와 메소드에 접근할 수 있다

        void method() {

            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {

        void method() {

            // field1 = 10;
            // method1();   정적 멤버 클래스는 인스턴스 필드와 메소드는 접근할 수 없다.

            field2 = 10;
            method2();
        }
    }
}
