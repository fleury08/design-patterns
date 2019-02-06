package com.github.fleury08.decorator.classes;

import com.github.fleury08.decorator.interfaces.ICoffee;

public class SimpleCoffee implements ICoffee {

    public SimpleCoffee() {
    }

    @Override
    public Double getCost() {
        return 1.0;
    }

    @Override
    public String getName() {
        return "Coffee";
    }
}
