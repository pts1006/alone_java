package co.pts.prb;

import java.util.Arrays;

public class Member implements Cloneable {
/* clone()을 재정의해서 깊은 복제로 변경 */
    public String name;
    public int age;

    // 참조 타입 필드(깊은 복제 대상들)
    public int[] scores;
    public Car car;

    public Member(String name, int age, int[] scores, Car car) {

        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // 먼저 얕은 복사를 해서 name, age를 복제한다.
        Member cloned = (Member) super.clone(); // Object의 clone() 호출

        // scores를 깊은 복제한다
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length); // clone() 메소드 재정의

        // car를 깊은 복제한다.
        cloned.car = new Car(this.car.model);

        // 깊은 복제된 Member 객체를 리턴
        return cloned;
    }

    public Member getMember() {

        Member cloned = null;

        try {
            cloned = (Member) clone();  // 재정의된 clone() 메소드 호출
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cloned;
    }
}
