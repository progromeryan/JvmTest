package com.proxy.test;

import java.rmi.Naming;

/**
 * Created by Administrator on 2017/9/14.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go()
    {
        try{
            MyRemote service  = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println("sdfsdf "+s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
