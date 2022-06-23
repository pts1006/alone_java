package com.pts.prc;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;

public class UdpReceiveExample {

	public static void main(String[] args) throws Exception {
		// 수신자
		
		DatagramChannel datagramChannel
		= DatagramChannel.open(StandardProtocolFamily.INET);
		
		datagramChannel.bind(new InetSocketAddress(5001));
		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				
				System.out.println("수신 시작");
				
				try {
					while (true) {
						ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
						SocketAddress socketAddress = datagramChannel.receive(byteBuffer);
						byteBuffer.flip();
						
						Charset charset = Charset.forName("UTF-8");
						String data = charset.decode(byteBuffer).toString();
						System.out.println("받은 내용: " + socketAddress.toString() + data);
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("수신 종료");
				}
			}
		};
		
		thread.start();
		
		Thread.sleep(1000);
		datagramChannel.close();
	}
}
