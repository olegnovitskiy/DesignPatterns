package com.fmdev.patterns.structural.adapter.freeman;

class GobbleTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble, gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
