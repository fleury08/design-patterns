package com.github.fleury08.decorator.classes.decorators;

import com.github.fleury08.decorator.classes.abstracts.CoffeeDecorator;
import com.github.fleury08.decorator.interfaces.ICoffee;

public class WithSugar extends CoffeeDecorator {

    public WithSugar(ICoffee coffee) {
        super(coffee);
    }


    @Override
    public Double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getName() {
        return super.getName()+", with sugar";
    }
}
