package co.jjw.prc;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Stu> treeSet = new TreeSet<Stu>();
		treeSet.add(new Stu("blue", 96));
		treeSet.add(new Stu("hong", 86));
		treeSet.add(new Stu("white", 92));
		
		Stu student = treeSet.last();
		
		System.out.println("최고점수: " + student.score);
		System.out.println("최고점수를 받은 아이디: " + student.id);
	}
}
