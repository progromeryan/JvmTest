package com.lesson8.test;


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by yqs on 2018/2/8.
 */
public class MethodHandleTest {
    static class ClassA {
        public void println(String s){
            System.out.println("51");
        }
    }

    private static MethodHandle getPrintLnMH(Object reveiver) throws Throwable {
        MethodType mt = MethodType.methodType(void.class,String.class);
        return MethodHandles.lookup().findVirtual(reveiver.getClass(),"println",mt).bindTo(reveiver);
    }

    public static void main(String[] args) throws Throwable {
        Object obj = System.currentTimeMillis() %2 == 0?System.out:new ClassA();
        getPrintLnMH(obj).invokeExact("lesson8");
    }
}
