package com.pts.prc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ClientExample {

	public static void main(String[] args) {
		// 연결 요청
		
		SocketChannel socketChannel = null;
		
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println("연결 요청");
			socketChannel.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if (socketChannel.isOpen()) {
			try {
				socketChannel.close();
			} catch (IOException e1) {
				// TODO: handle exception
			}
		}
	}
}
