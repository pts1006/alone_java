package co.pts.prc;

public class Key {
/* hashCode() 메소드를 재정의하지 않음 */
    public int number;

    public Key(int number) {

        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Key) {
            Key compareKey = (Key) obj;
            if (this.number == compareKey.number) {
                return true;
            }
        }

        return false;
    }

    /* 재정의 추가 */
    @Override
    public int hashCode() {

        return number;
    }
}