package co.jjw.prc;

public class Stu implements Comparable<Stu>{

	public String id;
	public int score;
	
	public Stu (String id, int score) {
		
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Stu o) {
		
		if (score < o.score) {
			return -1;
		} else if (score == o.score) {
			return 0;
		} else {
			return 1;
		}
	}
}
