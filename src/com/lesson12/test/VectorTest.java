package com.lesson12.test;

import java.util.Vector;

/**
 * Created by yqs on 2018/2/22.
 */
public class VectorTest {
    private  static Vector<Integer> vector = new Vector<Integer>();

    public static void main(String[] args) {
        while(true){
            for (int i=0;i<10;i++){
                vector.add(i);
            }
            Thread removeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (vector){
                        for (int i=0;i<10;i++){
                            vector.remove(i);
                        }
                    }
                }
            });

            Thread printThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (vector) {
                        for (int i=0;i<10;i++){
                            System.out.println((vector.get(i)));
                        }
                    }
                }


            });
            removeThread.start();
            printThread.start();
            while (Thread.activeCount()>20);
        }
    }
}
