package com.lesson8.test;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by yqs on 2018/2/8.
 */
public class Test {
    class GrandFather {
        void thinking(){
            System.out.println("i am grandfather");
        }
    }

    class Father extends  GrandFather{
        void thinking(){
            System.out.println("i am father");
        }
    }

    class Son extends Father{
        void thinking(){
            try {
                MethodType mt = MethodType.methodType(void.class);
                MethodHandle mh= MethodHandles.lookup().findVirtual(GrandFather.class,"thinking",mt).bindTo(new Test().new GrandFather());
                mh.invokeExact();
            } catch (Throwable throwable) {
            }
        }
    }


    public static void main(String[] args) {
        (new Test().new Son()).thinking();
    }
}
