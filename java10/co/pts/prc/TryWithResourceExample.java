package co.pts.prc;

public class TryWithResourceExample {
/* AutoCloseable 구현 클래스 */

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            throw new Exception();  // 강제적 예외 발생
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다");
        }
    }
}
