package co.pts.prc;

public class FileInputStream implements AutoCloseable {
/* 자동 리소스 닫기
    AutoCloseable 구현 클래스
*/
    private String file;

    public FileInputStream(String file) {

        this.file = file;
    }

    public void read() {

        System.out.println(file + "을 읽습니다");
    }

    @Override
    public void close() throws Exception {

        System.out.println(file + "을 닫습니다.");
    }
}
