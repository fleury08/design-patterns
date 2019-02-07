package com.github.fleury08.factory_method.factories;

import com.github.fleury08.factory_method.classes.Cat;
import com.github.fleury08.factory_method.classes.Dog;
import com.github.fleury08.factory_method.classes.Human;
import com.github.fleury08.factory_method.interfaces.IAnimal;
import com.github.fleury08.factory_method.interfaces.IAnimalFactory;

import java.util.Random;

public class RandomAnimalFactory implements IAnimalFactory {

    @Override
    public IAnimal createAnimal() {
        Random r = new Random();
        switch (r.nextInt(3)){
            case 0: return new Cat();
            case 1: return new Human();
            case 2: return new Dog();
            default: return this.createAnimal();
        }
    }
}
