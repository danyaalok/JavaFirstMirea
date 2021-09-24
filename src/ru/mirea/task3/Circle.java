package ru.mirea.task3;

public class Circle {
    protected double radius;
    static float PI = 3.14f;

    Circle(double radius) { this.radius=radius; }

    public double getRadius() { return radius; }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() { return (PI*Math.pow(this.radius,2)); }

    double getPerimeter() {
        return (2*PI*this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
