package co.jjw.pra;

public class AnonymousExample {
/* 익명 구현 클래스와 객체 생성 */
    public static void main(String[] args) {

        Anonymous anony = new Anonymous();

        // 익명 객체 필드 사용
        anony.field.turnOn();

        // 익명 객체 로컬 변수 사용
        anony.method1();

        // 익명 객체 매개값 사용
        anony.method2(
            new RemoteControl() {   // 매개값
                
                @Override
                public void turnOn() {
                    // TODO Auto-generated method stub
                    System.out.println("SmartTv를 켭니다.");
                }

                @Override
                public void turnOff() {
                    // TODO Auto-generated method stub
                    System.out.println("SmartTv를 끕니다.");
                }
            }
        );
    }
}
