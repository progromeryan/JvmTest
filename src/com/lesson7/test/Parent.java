package com.lesson7.test;

/**
 * Created by yqs on 2018/1/29.
 */
public class Parent {
    public static int A = 1;

    static {
        A = 2;
    }
}
class Sub extends  Parent{
        public static int B = A;

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}
