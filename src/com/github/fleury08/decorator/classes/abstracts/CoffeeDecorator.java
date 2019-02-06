package com.github.fleury08.decorator.classes.abstracts;

import com.github.fleury08.decorator.interfaces.ICoffee;

public abstract class CoffeeDecorator implements ICoffee {
    protected final ICoffee coffee;

    protected CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getName() {
        return coffee.getName();
    }
}
