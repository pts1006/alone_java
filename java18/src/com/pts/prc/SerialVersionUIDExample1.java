package com.pts.prc;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
	
	public static void main(String[] args) throws Exception {
		// 객체 직렬화
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC classC = new ClassC();
		
		classC.field1 = 1;
		oos.writeObject(classC);
		
		oos.flush();
		oos.close();
		fos.close();
	}
}
