package com.rm;

/**
 * @class: Thread
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年11月15日 14:59
 * @since: 1.0.0
 */
public class Thread01 extends Thread {
	public void run() {
		//这里就是线程要执行的代码
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(10L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadDemo1 {
	public static void main(String[] args) {
		Thread01 mt = new Thread01();
		Thread01 mt2 = new Thread01();
		mt.setName("线程1");
		mt2.setName("线程2");
		mt.start();
		mt2.start();
	}
}

class Thread02 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(10L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class threadDemo02 {
	
	public static void main(String[] args) {
		//C:创建任务类对象
		Thread02 task = new Thread02();
		//		D:创建线程类Thread的对象，并把任务类对象作为参数传递
		Thread t1 = new Thread(task, "线程01");
		Thread t2 = new Thread(task, "线程02");
		//E:启动线程
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "===" + i);
		}
	}
}
