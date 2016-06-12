package com.fmdev.patterns.structural.decorator.subramaniam;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, Integer> inc = e -> e + 1;
        Function<Integer, Integer> doubleIt = e -> e * 2;

        doWork(5, inc);
        doWork(5, doubleIt);

        // increment and double
        int temp = inc.apply(5);
        System.out.println(doubleIt.apply(temp));
    }

    private static void doWork(int value, Function<Integer, Integer> func) {
        System.out.println(func.apply(value));
    }
}
