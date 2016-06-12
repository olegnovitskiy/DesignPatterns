package com.fmdev.patterns.behavioral.strategy.subramaniam;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // total all values
        System.out.println(totalValues(numbers));
        System.out.println(totalEvenValues(numbers));
        System.out.println(totalOddValues(numbers));
    }

    private static int totalOddValues(List<Integer> values) {
        int result = 0;

        for (int e : values) {
            if (e % 2 != 0) {
                result += e;
            }
        }
        return result;
    }

    private static int totalEvenValues(List<Integer> values) {
        int result = 0;

        for (int e : values) {
            if (e % 2 == 0) {
                result += e;
            }
        }
        return result;
    }

    private static int totalValues(List<Integer> values) {
        int result = 0;

        for (int e: values) {
            result += e;
        }

        return result;
    }
}
