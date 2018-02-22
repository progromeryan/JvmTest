package com.lesson12.test;

/**
 * volatile 变量自增运算测试
 */
public class VolatileTest {

    public static volatile int race  =0;

    private  static  final int THREADS_COUNT = 4;

    public static void increase(){
        race++;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i=0;i<THREADS_COUNT;i++){
            threads[i]= new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<1000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() >1)
            Thread.yield();
        System.out.println(race);

    }
}
