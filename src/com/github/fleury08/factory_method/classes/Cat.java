package com.github.fleury08.factory_method.classes;

import com.github.fleury08.factory_method.interfaces.IAnimal;

public class Cat implements IAnimal {

    @Override
    public String getTypeOfAnimal() {
        return "Cat";
    }

    @Override
    public String getName() {
        return "Mr. Twinkles";
    }
}
