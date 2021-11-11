package com.bonustask;

public class Main {
    public static void main(String[] args) {
        MyArea myArea = new MyArea();
        MyArea.scanner();
        float radius = myArea.getRadius();
        System.out.println("Площа кола: " + MyArea.areaOfCircle(radius));
    }
}
