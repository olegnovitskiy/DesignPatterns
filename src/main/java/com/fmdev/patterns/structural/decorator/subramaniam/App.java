package com.fmdev.patterns.structural.decorator.subramaniam;

import java.util.function.*;
import java.awt.*;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
class Camera {
    private Function<Color, Color> filter;

    Camera(Function<Color, Color>... filters) {
        setFilters(filters);
    }

    private void setFilters(Function<Color, Color>... filters) {
        filter = Stream.of(filters)
                .reduce(
                        Function.identity(),
                        Function::andThen
                );
    }

    Color snap(Color input) {
        return filter.apply(input);
    }
}

@SuppressWarnings("unchecked")
public class App {
    private static void printSnap(Camera camera) {
        System.out.println(camera.snap(new Color(125, 125, 125)));
    }

    public static void main(String[] args) {
        printSnap(new Camera());
        printSnap(new Camera(Color::brighter));
        printSnap(new Camera(Color::darker));
        printSnap(new Camera(Color::brighter, Color::darker));
    }
}
