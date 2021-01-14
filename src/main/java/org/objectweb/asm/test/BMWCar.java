package org.objectweb.asm.test;

public class BMWCar implements Car {

    private String name;

    public BMWCar() {
        name = "宝马";
    }

    @Override
    public void drive() {
        System.out.println("BMW car drive." + name);
    }

}