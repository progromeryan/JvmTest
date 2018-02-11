package com.lesson8.test;

public class Calc {
    public static  int calc(){
        int a = 100;
        int b = 200;
        int c= 300;
        return (a+b)+c;
    }

    public static void methodOne(){
        methodOne();
    }

    public static void main(String[] args) {
        methodOne();
        calc();
    }
}
