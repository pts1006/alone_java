package co.jjw.prc;

public class RemoteControlExample {
    
    public static void main(String[] args) {

        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();
        
        // 익명 구현 객체
        RemoteControl anony = new RemoteControl() {

            @Override
            public void turnOn() {
                // 실행문
                System.out.println("되냐?");
            }

            @Override
            public void turnOff() {
                // 실행문
                
            }

            @Override
            public void setVolume(int volume) {
                // 실행문
                
            }
        };

        anony.turnOn();

        // 정적 메소드 사용: 인터페이스의 정적 메소드는 인터페이스로 바로 호출이 가능하다.
        RemoteControl.changeBattery();
    }
 }
