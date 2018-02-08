package com.lesson8.test;

/**
 * Created by yqs on 2018/2/8.
 * 方法动态分配演示
 */
public class DynamicDispatch {
    static abstract class Human{
        protected abstract void sayHello();
    }

    static class Man extends Human {
        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }

    static class WoMan extends Human {
        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new WoMan();
        man.sayHello();
        woman.sayHello();
        man = new WoMan();
        man.sayHello();
    }
}
