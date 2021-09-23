package ru.mirea.task7;

class Circle extends Shape {
    protected double radius;
    static float PI = 3.14f;

    Circle() {}

    Circle(double radius) { this.radius=radius; }

    Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() { return (PI*Math.pow(this.radius,2)); }

    @Override
    double getPerimeter() {
        return (2*PI*this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
