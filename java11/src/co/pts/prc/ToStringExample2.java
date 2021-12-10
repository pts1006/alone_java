package co.pts.prc;

import java.util.Objects;

public class ToStringExample2 {
    /* 객체 문자 정보 */
    public static void main(String[] args) {

        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        System.out.println(Objects.toString(str2, "이름이 없습니다."));
    }
}
