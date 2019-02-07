package com.github.fleury08.factory_method.factories;

import com.github.fleury08.factory_method.interfaces.IAnimal;
import com.github.fleury08.factory_method.interfaces.IAnimalFactory;

import java.util.*;

public class BalanceAnimalFactory implements IAnimalFactory {
    private List<Class> availableAnimals;
    private List<Class> pool;

    public BalanceAnimalFactory(List<Class> availableAnimals) {
        this.availableAnimals = availableAnimals;
        this.pool = new ArrayList<>(availableAnimals);
    }

    @Override
    public IAnimal createAnimal() {
        if(this.pool.size()==0) this.pool = new ArrayList<>(availableAnimals);
        Random r = new Random();
        try {
            Class<IAnimal> a = this.pool.get(r.nextInt(this.pool.size()));
            this.pool.remove(a);
            return a.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
