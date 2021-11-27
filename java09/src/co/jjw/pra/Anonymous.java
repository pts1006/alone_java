package co.jjw.pra;

public class Anonymous {
    // 익명 구현 클래스와 객체 생성

    // 필드 초기값으로 대입
    RemoteControl field = new RemoteControl() {

    /* 필드 선언과 초기값 대입 */
        @Override
        public void turnOn() {
            // TODO Auto-generated method stub
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            // TODO Auto-generated method stub
            System.out.println("TV를 끕니다.");
        }
        
    };

    void method1() {
        
        // 로컬 변수값으로 대입
        RemoteControl localVar = new RemoteControl() {

        /* 로컬 변수 선언과 초기값 대입 */
            @Override
            public void turnOn() {
                // TODO Auto-generated method stub
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                // TODO Auto-generated method stub
                System.out.println("Audio를 끕니다.");
            }
        };

        // 로컬 변수 사용
        localVar.turnOn();
    }

    void method2(RemoteControl rc) {

        rc.turnOn();
    }
}
