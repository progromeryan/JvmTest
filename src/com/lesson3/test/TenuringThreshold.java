package com.lesson3.test;

/**
 * Created by yqs on 2018/1/17.
 */
public class TenuringThreshold {

    private static final int _1MB = 1024 *1024;

    public static void testTenuringThreshold()
    {
        byte[] allocation1,allocation2,allocation3;
        allocation1 =  new byte[_1MB/4];
        allocation2 =  new byte[_1MB*4];
        allocation3 =  new byte[_1MB*4];
        allocation3 = null;
        allocation3 =  new byte[_1MB*4];
        System.gc();
    }

    public static void testTenuringThreshold2()
    {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 =  new byte[_1MB/4];
        allocation2 =  new byte[_1MB/4];
        allocation3 =  new byte[_1MB*4];
        allocation4 =  new byte[_1MB*4];
        allocation4 = null;
        allocation4 =  new byte[_1MB*4];
        System.gc();
    }

    public static void main(String[] args) {
//        testTenuringThreshold();
        testTenuringThreshold2();
    }
}
