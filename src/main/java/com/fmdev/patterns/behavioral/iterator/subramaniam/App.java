package com.fmdev.patterns.behavioral.iterator.subramaniam;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // external iterator
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

//        for (int e : numbers) {
//            System.out.println(e);
//        }

          // internal iterator
//        numbers.forEach(e-> System.out.println(e));

        numbers.forEach(System.out::println);
    }
}
