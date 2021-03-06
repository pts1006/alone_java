package com.pts.prc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// 다양한 객체를 쓰고 읽기
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(10);
		oos.writeObject(3.14);
		oos.writeObject(new int[] {1, 2, 3});
		oos.writeObject("홍길동");
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
		
	}
}
