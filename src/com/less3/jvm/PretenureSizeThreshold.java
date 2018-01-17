package com.less3.jvm;

/**
 * Created by yqs on 2018/1/16.
 */
public class PretenureSizeThreshold {
    private static final int _1MB = 1024 *1024;
    /**
     * 大对象
     */
    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation = new byte[4*_1MB];
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
