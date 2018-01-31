package com.lesson8.test;

/**
 * Created by yqs on 2018/1/31.
 */
public class LocalVariableTable {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64*1024*1024];
        }
       int a;
        System.gc();
        System.out.println();
    }
}
