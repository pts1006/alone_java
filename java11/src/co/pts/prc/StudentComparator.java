package co.pts.prc;

import java.util.Comparator;

import co.pts.prc.CompareExample.Student;

public class StudentComparator implements Comparator<Student> {
    /* 학생 번호 비교자 */
    @Override
    public int compare(Student a, Student b) {

        if (a.sno < b.sno) return -1;
        else if (a.sno == b.sno) return 0;
        else return 1;

        // 위와 같음
        // return Integer.compare(a.sno, b.sno);
    }

    /* 
        Objects.compare(T a, T b, Comparator<T> c) 메소드는
        두 객체를 비교자(Comparator)로 비교해서 int 값을 리턴한다.
    */
}
