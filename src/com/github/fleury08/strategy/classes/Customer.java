package com.github.fleury08.strategy.classes;

import com.github.fleury08.strategy.interfaces.IBillingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    protected IBillingStrategy strategy;
    protected final List<Double> cart;

    public Customer(IBillingStrategy strategy) {
        this.strategy = strategy;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Double obj){
        this.cart.add(strategy.getPrice(obj));
    }

    public void checkout(){
        Double sum = 0.0;
        for (Double item : this.cart) sum += item;
        System.out.println("Total sum is:"+sum);
        this.cart.clear();
    }

    public void setStrategy(IBillingStrategy strategy) {
        this.strategy = strategy;
    }
}
