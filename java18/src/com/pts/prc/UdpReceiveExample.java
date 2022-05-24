package com.pts.prc;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {

	public static void main(String[] args) throws Exception {
		// 수신자
		DatagramSocket datagramSocket = new DatagramSocket(5001);	// 5001번 포트에서 수신하는 DatagramSocket 생성
		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				
				System.out.println("[수신 시작]");
				try {
					while (true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet);
					}
				} catch (Exception e) {
					System.out.println("[수신 종료]");
				}
			}
		};
		
		thread.start();
		
		Thread.sleep(10000);
		datagramSocket.close();
	}

}
