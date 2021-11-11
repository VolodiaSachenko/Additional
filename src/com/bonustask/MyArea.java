package com.bonustask;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 10.11.21
 */

public class MyArea {
    private static float radius;
    private static final float PI = (float) Math.PI;

    public void setRadius(float radius) {
        MyArea.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    static void scanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            MyArea myArea = new MyArea();
            System.out.println("Будь ласка, напишіть радіус кола, для підрахунку його площі: ");
            float radius = scanner.nextFloat();
            myArea.setRadius(radius);
        } catch (NoSuchElementException e) {
            System.out.println("Помилка, введіть, будь ласка, число.");
        }
    }

    static float areaOfCircle(float radius) {
        return PI * (float) Math.pow(radius, 2);
    }
}
