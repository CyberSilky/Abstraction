package com.company;
import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // ExampleofAbstractClass is the shape
        // ExampleOfConcreteClass is the rectangle

        ExampleOfConcreteClass r = new ExampleOfConcreteClass("purple", 5, 2);
        Circle c = new Circle("blue", 4);

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Circle Area: " + c.getArea());

        System.out.println(r.draw());
        System.out.println(c.draw());
    }
}
