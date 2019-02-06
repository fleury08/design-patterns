package com.github.fleury08.decorator;

import com.github.fleury08.decorator.classes.SimpleCoffee;
import com.github.fleury08.decorator.classes.decorators.Decaffinated;
import com.github.fleury08.decorator.classes.decorators.WithMilk;
import com.github.fleury08.decorator.classes.decorators.WithSugar;
import com.github.fleury08.decorator.interfaces.ICoffee;

public class DecoratorMain {
    public DecoratorMain() {
        ICoffee coffee = new SimpleCoffee();
        System.out.println(coffee.getName()+": "+coffee.getCost());

        coffee = new WithMilk(coffee);
        System.out.println(coffee.getName()+": "+coffee.getCost());

        coffee = new WithSugar(coffee);
        System.out.println(coffee.getName()+": "+coffee.getCost());

        coffee = new Decaffinated(coffee);
        System.out.println(coffee.getName()+": "+coffee.getCost());
    }
}
