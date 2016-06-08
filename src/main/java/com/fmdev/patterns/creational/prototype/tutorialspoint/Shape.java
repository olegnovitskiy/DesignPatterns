package com.fmdev.patterns.creational.prototype.tutorialspoint;

public abstract class Shape implements Cloneable {
    private String id;
    String type;

    abstract void draw();

    String getType(){
        return type;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
