package com.lesson7.test;

/**
 * Created by yqs on 2018/1/29.
 */
public class DeadLoopClass {
    static {
        if(true)
        {
            System.out.println(Thread.currentThread() +" init DeadLoopClass");
            while(true){

            }
        }
    }

    public static void main(String[] args) {
        Runnable scipt = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() +" start");
                DeadLoopClass dlc = new DeadLoopClass();
                System.out.println(Thread.currentThread() +" run over");
            }
        };

        Thread thread1 = new Thread(scipt);
        Thread thread2 = new Thread(scipt);
        thread1.start();
        thread2.start();
    }
}
