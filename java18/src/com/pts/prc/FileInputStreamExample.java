package com.pts.prc;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// 텍스트 파일을 읽고 출력
		try {
			FileInputStream fis = new FileInputStream(
					"C:/workspace/java18/src/com/pts/prc/FileInputStreamExample.java"
			);
			
			int data;
			
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
