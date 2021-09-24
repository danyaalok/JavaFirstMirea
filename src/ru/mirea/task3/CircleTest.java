package ru.mirea.task3;

public class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle (10.0);
        System.out.println("Perimetr: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        circle.toString();
    }
}
