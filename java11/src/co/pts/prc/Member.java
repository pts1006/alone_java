package co.pts.prc;

public class Member {
/* 객체 동등 비교 메소드 */
    public String id;

    public Member(String id) {

        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Member) {    // 매개값이 Member타입인지 확인
            Member member = (Member) obj;
            if (id.equals(member.id)) {
                return true;
            }
        }

        return false;
    }

    /* 메소드 재정의 추가 */
    @Override
    public int hashCode() {

        return id.hashCode();
    }
}
