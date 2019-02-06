package com.github.fleury08.decorator.classes.decorators;

import com.github.fleury08.decorator.classes.abstracts.CoffeeDecorator;
import com.github.fleury08.decorator.interfaces.ICoffee;

public class WithMilk extends CoffeeDecorator {

    protected WithMilk(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public Double getCost() {
        return super.getCost() + 4.0;
    }

    @Override
    public String getName() {
        return super.getName()+", with milk";
    }
}
