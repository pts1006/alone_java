package com.pts.prc;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {

	public static void main(String[] args) throws IOException {
		// 파일 복사
		
		Path from = Paths.get("C:/Temp/house.jpg");
		Path to = Paths.get("C:/Temp/house(1).jpg");
		
		// 읽기 FileChannel 생성
		FileChannel fileChannel_from = FileChannel.open(from, StandardOpenOption.READ);
		
		// 쓰기 FileChannel 생성
		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		ByteBuffer buffer = ByteBuffer.allocate(100);
		int byteCount;
		
		while (true) {
			buffer.clear();
			byteCount = fileChannel_from.read(buffer);	// 읽기
			if (byteCount == -1) break;
			buffer.flip();
			fileChannel_to.write(buffer);	// 쓰기
		}
		
		fileChannel_from.close();
		fileChannel_to.close();
		System.out.println("파일 복사 성공");
	}
}
