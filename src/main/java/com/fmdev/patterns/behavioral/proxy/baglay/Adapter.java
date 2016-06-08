package com.fmdev.patterns.behavioral.proxy.baglay;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class Adapter {

    public static Target getProxy(final Adaptee adaptee) {
        return (Target) Proxy.newProxyInstance(
                Adapter.class.getClassLoader(),
                new Class[] {Target.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("request")) {
                            return adaptee.specificRequest(args[0]);
                        }
                        throw new UnsupportedOperationException("Call non exists method: " + method);
                    }
                });
    }
}
