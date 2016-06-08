package com.fmdev.patterns.creational.abstractfactory.buday;

public class App {
    public static void main(String[] args) {
        ToyFactory toyFactory = new TeddyToysFactory();
        Bear bear = toyFactory.getBear();
        Cat cat = toyFactory.getCat();
        System.out.println("I've got " + bear.getName() + " and " + cat.getName());

        toyFactory = new WoodenToysFactory();
        bear = toyFactory.getBear();
        cat = toyFactory.getCat();
        System.out.println("I've got " + bear.getName() + " and " + cat.getName());
    }
}
