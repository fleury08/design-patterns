package com.github.fleury08.strategy.classes;

import com.github.fleury08.strategy.interfaces.IBillingStrategy;

public class PromoBillingStrategy implements IBillingStrategy {

    @Override
    public Double getPrice(Double rawPrice) {
        return rawPrice*0.8;
    }
}
