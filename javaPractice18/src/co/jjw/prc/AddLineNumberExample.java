package co.jjw.prc;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		
		// 정확한 경로로 수정
		String filePath = 
				"C:/JavaProgramming/source/chap18/src/sec05/exam04_bufferedreader/BufferedReaderExample.java";
		
		// 작성 위치
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		
		while ((rowData = br.readLine()) != null) {
			System.out.println(++rowNumber + ": " + rowData);
		}
		
		br.close();
		fr.close();
	}
}
