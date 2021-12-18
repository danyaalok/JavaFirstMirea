package ru.mirea.task2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("треугольник");
        shape.setType("треугольник");
        System.out.println("Тип фигуры: " + shape.getType());
    }
}