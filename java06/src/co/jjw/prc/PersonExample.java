package co.jjw.prc;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("12345601234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
	}
}
