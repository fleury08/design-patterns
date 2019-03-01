package com.github.fleury08.facade;

import com.github.fleury08.facade.classes.SubSystemA;
import com.github.fleury08.facade.classes.SubSystemB;
import com.github.fleury08.facade.classes.SubSystemC;

public class FacadeMain {

    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    public FacadeMain(){

        System.out.println("\nRunning A operations");
        operationA();

        System.out.println("\nRunning B operations");
        operationB();

        System.out.println("\nRunning combined operations");
        combineOperation();
    }

    public void operationA(){
        this.a.operationA();
        this.b.operationA();
        this.c.operationA();
    }

    public void operationB(){
        this.c.operationB();
        this.b.operationB();
        this.a.operationB();
    }

    public void combineOperation(){
        this.a.operationB();
        this.a.operationA();
        this.b.operationA();
        this.c.operationB();
    }
}
