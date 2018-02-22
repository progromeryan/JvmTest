package com.proxy.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Administrator on 2017/9/14.
 */
public interface MyRemote extends Remote{
    String sayHello() throws RemoteException;
}
