package com.company;

public abstract class ExampleofAbstractClass {
    String color;

    public ExampleofAbstractClass(String color) {
        this.color = color;
    }

    abstract double getArea();
    abstract String draw();
}
