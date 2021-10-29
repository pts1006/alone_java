package co.jjw.prc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue",  96);
		map.put("hong",  86);
		map.put("white",  92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> EntrySet = map.entrySet();
		
		for (Map.Entry<String, Integer> entry : EntrySet) {
			
			if (entry.getValue() > maxScore ) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			
			totalScore += entry.getValue();
		}
		
		int avgScore = totalScore / map.size();
		
		System.out.println("평균 점수 : " + avgScore);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}
}
