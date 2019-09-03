package com.keng;

import java.util.concurrent.CountDownLatch;

/**
 * @class: CurrentTimeMillis
 * @title: //并发调用System.currentTimeMillis()一百次，耗费的时间是单线程调用一百次的250倍。
 *
 * @desc: //调用gettimeofday()需要从用户态切换到内核态；
 * gettimeofday()的表现受Linux系统的计时器（时钟源）影响，在HPET计时器下性能尤其差；
 * 系统只有一个全局时钟源，高并发或频繁访问会造成严重的争用。
 *
 * @author: Lyy
 * @date: 2019年09月02日 12:29
 * @since: 1.0.0
 */
public class Test21_CurrentTimeMillis {

    private static final int COUNT = 100;

    public static void main(String[] args) throws Exception {
        long beginTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            System.currentTimeMillis();
        }
        long elapsedTime = System.nanoTime(); //beginTime;
        System.out.println("100 System. currentTimeMillis() serial calls:"+ elapsedTime+ "ns");
                CountDownLatch startLatch = new CountDownLatch(1);
                CountDownLatch endLatch = new CountDownLatch(COUNT);
        for (int i = 0; i < COUNT; i++) {
            new Thread(() -> {
                try {
                    startLatch.await();
                    System.currentTimeMillis();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    endLatch.countDown();
                }
            }).start();
        }
        beginTime = System.nanoTime();
        startLatch.countDown();
        endLatch.await();
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("100 System. currentTimeMillis() parallel calls:"+ elapsedTime+" ns ");
    }
}
