package co.jjw.prc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat change = new SimpleDateFormat("2024년 05월 08일 화요일 10시 30분");
		System.out.println(change.format(now));
	}
}
