package com.proxy.test;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Administrator on 2017/9/14.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says,'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("RemoteHello", service);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
