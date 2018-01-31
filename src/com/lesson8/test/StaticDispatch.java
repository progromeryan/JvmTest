package com.lesson8.test;

/**
 * Created by yqs on 2018/1/31.
 */
public class StaticDispatch {
    static abstract class Human{

    }

    static class Man extends Human{

    }

    static class Women extends Human{

    }

    public void sayHello(Man guy){
        System.out.println("hello,guy!");
    }

    public void sayHello(Women guy){
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Women();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);
    }
}
