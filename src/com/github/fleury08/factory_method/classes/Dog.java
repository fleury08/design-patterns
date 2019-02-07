package com.github.fleury08.factory_method.classes;

import com.github.fleury08.factory_method.interfaces.IAnimal;

public class Dog implements IAnimal {
    @Override
    public String getTypeOfAnimal() {
        return "Dog";
    }

    @Override
    public String getName() {
        return "Terry";
    }
}
