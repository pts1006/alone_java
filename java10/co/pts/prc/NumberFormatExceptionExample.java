package co.pts.prc;

public class NumberFormatExceptionExample {
    
    public static void main(String[] args) {

        String data1 = "100";   // 숫자 변환 가능
        String data2 = "a100";  // 숫자 변환 불가능

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);   // NumberFormatException 발생

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }
}
