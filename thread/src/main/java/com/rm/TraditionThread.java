package com.rm;

/**
 * @class: TraditionThread
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年11月11日 11:27
 * @since: 1.0.0
 */
public class TraditionThread {
	
	public static void main(String[] args) {
		Thread thread = new Thread(){
			@Override
			public void run(){
				System.out.println("第一个线程。");
			}
		};
		thread.start();
		thread.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("第二个线程。");
			}
		});
		thread2.start();
	}
	
}
