package com.company;

public class ExampleOfConcreteClass extends ExampleofAbstractClass{
    double length;
    double width;

    public ExampleOfConcreteClass(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;

    }

    public String draw() {
        return "A " + color + " rectangle " + length + " inches long and " + width + " inches wide is drawn.";
    }
}
