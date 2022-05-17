package com.pts.prc;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		// 객체 역직렬화
		FileInputStream fis = new FileInputStream("C:/Temp/file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC) ois.readObject();
		
		System.out.println("field1: " + classC.field1);
	}
}
