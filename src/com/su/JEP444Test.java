package com.su;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 虚拟线程
 */
public class JEP444Test {

    public static void main(String[] args) {
        //方法一
        Runnable fn = () -> {
            System.out.println("hello world 1");
        };
        Thread thread1 = Thread.ofVirtual().name("myThread-", 1).start(fn);
        System.out.println("thread1: " + thread1.getName());
        //方法二
        Thread thread2 = Thread.startVirtualThread(() -> {
            System.out.println("hello world 2");
        });
        //方法三
        var executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            System.out.println("hello world 3");
        });
        //方法四
        MyThead myThead = new MyThead();
        ThreadFactory factory = Thread.ofVirtual().factory();
        Thread thread4 = factory.newThread(myThead);
        thread4.start();
    }

    static class MyThead implements Runnable {

        @Override
        public void run() {
            System.out.println("hell world 4");
        }
    }

}
