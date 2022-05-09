package com.pts.prc;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		// 버퍼 사용여부에 따른 성능 비교
		long start	= 0;
		long end	= 0;
		
		FileInputStream fis1 = new FileInputStream("C:/workspace/java18/src/com/pts/prc/house.jpg");
		
		start = System.currentTimeMillis();
		
		while (fis1.read() != -1) {}
		
		end = System.currentTimeMillis();
		
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		
		fis1.close();
		
		//////////////
		
		FileInputStream fis2	= new FileInputStream("C:/workspace/java18/src/com/pts/prc/house.jpg");
		BufferedInputStream bis	= new BufferedInputStream(fis2);	// 버퍼 스트림 생성
		
		start = System.currentTimeMillis();
		
		while (bis.read() != -1) {}
		
		end = System.currentTimeMillis();
		
		System.out.println("사용했을 때: " + (end - start) + "ms");
		
		bis.close();
		fis2.close();
	}
}
