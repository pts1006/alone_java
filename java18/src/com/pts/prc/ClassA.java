package com.pts.prc;

import java.io.Serializable;

public class ClassA implements Serializable {
//	직렬화가 가능한 클래스
	// 직렬화에 포함
	int field1;
	ClassB field2 = new ClassB();
	
	// 직렬화에서 제외
	static int field3;
	transient int field4;
}
