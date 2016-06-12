package com.fmdev.patterns.structural.decorator.subramaniam;
import java.util.function.*;
import java.awt.*;

class Camera {
    Color snap(Color input) {
        return input;
    }
}

public class App {
    private static void printSnap(Camera camera) {
        System.out.println(camera.snap(new Color(125,125,125)));
    }

    public static void main(String[] args) {
        printSnap(new Camera());
    }
}
