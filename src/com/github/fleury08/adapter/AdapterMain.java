package com.github.fleury08.adapter;

import com.github.fleury08.adapter.classes.Socket;
import com.github.fleury08.adapter.classes.SocketClassAdapterImpl;
import com.github.fleury08.adapter.classes.Volts;
import com.github.fleury08.adapter.interfaces.SocketAdapter;

public class AdapterMain {
    public AdapterMain(){
        Socket so = new Socket();
        SocketAdapter sa = new SocketClassAdapterImpl();
        System.out.println("Using standard "+so.getVolts().getAmmount()+"V");
        System.out.println("Using "+sa.get5Volts().getAmmount()+"V through adapter");
        System.out.println("Using "+sa.get10Volts().getAmmount()+"V through adapter");
        System.out.println("Using "+sa.get120Volts().getAmmount()+"V through adapter");
    }
}
