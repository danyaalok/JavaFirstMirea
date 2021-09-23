package ru.mirea.task7;

class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {}

    Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getLength() { return length; }

    public void setLength(double length) { this.length = length; }

    @Override
    double getArea() { return (this.length*this.width); }

    @Override
    double getPerimeter() {
        return (2*(this.length+this.width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
