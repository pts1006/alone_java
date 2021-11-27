package co.jjw.pra;

public class Window {
/* UI 클래스 */
    Button button1 = new Button();
    Button button2 = new Button();

    // 필드 초기값으로 대입
    Button.OnClickListener listener = new Button.OnClickListener() {

        @Override
        public void onClick() {
            // TODO Auto-generated method stub
            System.out.println("전화를 겁니다.");
        }
        
    };  // 필드 선언과 초기값 대입

    Window() {
        button1.setOnClickListener(listener);   // 매개값으로 필드 대입
        button2.setOnClickListener(new Button.OnClickListener() {   // 매개값으로 익명 구현 객체 타입
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });
    }
}
