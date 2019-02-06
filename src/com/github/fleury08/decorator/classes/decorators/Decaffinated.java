package com.github.fleury08.decorator.classes.decorators;

import com.github.fleury08.decorator.classes.abstracts.CoffeeDecorator;
import com.github.fleury08.decorator.interfaces.ICoffee;

public class Decaffinated extends CoffeeDecorator {

    public Decaffinated(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getName() {
        return super.getName()+", decaffinated";
    }
}
