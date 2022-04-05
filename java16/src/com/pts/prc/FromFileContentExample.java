package com.pts.prc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		// 파일 내용을 소스로 하는 스트림
		Path path = Paths.get("src/com/pts/pra/helloWorld.txt");	// 파일의 경로 정보를 가지고 있는 Path 객체 생성
		Stream<String> stream;
		
		// Files.lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset());	// 운영 체제의 기본 문자셋
		stream.forEach(System.out :: println);	// 메소드 참조 (s -> System.out.println(s)와 동일)
		System.out.println();
		
		// BufferedReader의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println);
	}
}
