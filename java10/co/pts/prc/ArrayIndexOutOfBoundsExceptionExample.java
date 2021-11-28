package co.pts.prc;

public class ArrayIndexOutOfBoundsExceptionExample {
/* ArrayIndexOutOfBoundsException */
    public static void main(String[] args) {
        /* 
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
        */

        if (args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];
            System.out.println("args[0]: " + data1);
            System.out.println("args[1]: " + data2);
        } else {
            System.out.println("[실행 방법]");
            System.out.print("java ArrayIndexOutOfBoundsExceptionExample    ");
            System.out.print("값1 값2");
        }

        /* 
            배열에서 인덱스 범위를 초과하여 사용할 경우 실행 예외가 발생한다.
            따라서 조건을 주어야 한다.
        */
    }
}
