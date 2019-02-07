package com.github.fleury08.factory_method.classes;

import com.github.fleury08.factory_method.interfaces.IAnimal;

public class Human implements IAnimal {
    @Override
    public String getTypeOfAnimal() {
        return "Human";
    }

    @Override
    public String getName() {
        return "Rick";
    }
}
