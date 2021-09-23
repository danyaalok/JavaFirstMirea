package ru.mirea.task7;

class Square extends Rectangle {
    protected double side;

    Square() {}

    Square(double side){
        this.side=side;
    }

    Square(double side, String color, boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        this.width=side;
    }

    public void setLength(double side){
        this.length=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}