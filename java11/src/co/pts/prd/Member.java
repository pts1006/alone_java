package co.pts.prd;

public class Member implements Comparable<Member> {

	// Comparable 구현 클래스
	String name;
	
	Member(String name) {
		
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		
		return name.compareTo(o.name);
	}
}
