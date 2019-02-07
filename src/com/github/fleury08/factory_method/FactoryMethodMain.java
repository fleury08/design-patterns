package com.github.fleury08.factory_method;

import com.github.fleury08.factory_method.classes.Cat;
import com.github.fleury08.factory_method.classes.Dog;
import com.github.fleury08.factory_method.classes.Human;
import com.github.fleury08.factory_method.factories.BalanceAnimalFactory;
import com.github.fleury08.factory_method.factories.RandomAnimalFactory;
import com.github.fleury08.factory_method.interfaces.IAnimal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FactoryMethodMain {
    public FactoryMethodMain() {
        RandomAnimalFactory r = new RandomAnimalFactory();
        List<IAnimal> ra = new ArrayList<IAnimal>();
        ra.add(r.createAnimal());
        ra.add(r.createAnimal());
        ra.add(r.createAnimal());
        ra.add(r.createAnimal());
        ra.add(r.createAnimal());
        ra.add(r.createAnimal());

        List<Class> l = new ArrayList<Class>();
        l.add(Dog.class);
        l.add(Human.class);
        l.add(Cat.class);
        BalanceAnimalFactory b = new BalanceAnimalFactory(l);
        List<IAnimal> ba = new ArrayList<IAnimal>();
        ba.add(b.createAnimal());
        ba.add(b.createAnimal());
        ba.add(b.createAnimal());
        ba.add(b.createAnimal());
        ba.add(b.createAnimal());
        ba.add(b.createAnimal());

        System.out.println("\nRandom Animals");
        ra.forEach(a->{
            System.out.println(a.getTypeOfAnimal()+":"+a.getName());
        });


        System.out.println("\nBalanced Animals");
        ba.forEach(a->{
            System.out.println(a.getTypeOfAnimal()+":"+a.getName());
        });

    }
}
