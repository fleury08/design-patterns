package com.github.fleury08.strategy;

import com.github.fleury08.strategy.classes.Customer;
import com.github.fleury08.strategy.classes.NormalBillingStrategy;
import com.github.fleury08.strategy.classes.PromoBillingStrategy;
import com.github.fleury08.strategy.interfaces.IBillingStrategy;

public class StrategyMain {
    public StrategyMain() {
        IBillingStrategy normal = new NormalBillingStrategy();
        IBillingStrategy promo = new PromoBillingStrategy();

        Customer customer1 = new Customer(normal);
        Customer customer2 = new Customer(promo);

        customer1.addToCart(1.0);
        customer1.addToCart(2.0);
        customer1.addToCart(3.0);


        customer2.addToCart(1.0);
        customer2.addToCart(2.0);
        customer2.addToCart(3.0);

        customer1.checkout();
        customer2.checkout();
    }
}
