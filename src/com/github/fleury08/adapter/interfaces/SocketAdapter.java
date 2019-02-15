package com.github.fleury08.adapter.interfaces;

import com.github.fleury08.adapter.classes.Volts;

public interface SocketAdapter {

    public Volts get120Volts();
    public Volts get10Volts();
    public Volts get5Volts();
}
