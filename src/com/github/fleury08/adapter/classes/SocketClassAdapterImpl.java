package com.github.fleury08.adapter.classes;

import com.github.fleury08.adapter.interfaces.SocketAdapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volts get120Volts() {
        return getVolts();
    }

    @Override
    public Volts get10Volts() {
        Volts v = getVolts();
        return convertVolts(v,12);
    }

    @Override
    public Volts get5Volts() {
        Volts v = getVolts();
        return convertVolts(v,24);
    }

    private Volts convertVolts(Volts v, int n){
        return new Volts(v.getAmmount()/n);
    }
}
