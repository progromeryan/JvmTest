package com.lesson4.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yqs on 2018/1/17.
 */
public class JConsole {
    static class OOMObject{
        public  byte[] placeholder = new byte[64 *1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i =0;i<num;i++){
            Thread.sleep(10);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
