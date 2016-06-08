package com.fmdev.patterns.behavioral.proxy.baglay;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class Adaptee {

    public Object specificRequest(Object input) {
        System.out.println("Call Adaptee.specificRequest(" + input + ")");
        return "Hello from Adaptee!";
    }

}
