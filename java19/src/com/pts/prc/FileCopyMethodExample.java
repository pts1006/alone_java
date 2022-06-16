package com.pts.prc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyMethodExample {

	public static void main(String[] args) throws IOException {
		// 파일 복사
		
		Path from = Paths.get("C:/Temp/file.txt");
		Path to = Paths.get("C:/Temp/file2.txt");
		
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("파일 복사 성공");
	}
}
