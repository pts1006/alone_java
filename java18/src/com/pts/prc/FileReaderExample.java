package com.pts.prc;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		// 텍스트 파일 읽기
		FileReader fr = new FileReader(
			"C:/workspace/java18/src/com/pts/prc/FileReaderExample.java"
		);
		
		int readCharNo;
		char[] cbuf = new char[100];
		
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		fr.close();
	}
}
