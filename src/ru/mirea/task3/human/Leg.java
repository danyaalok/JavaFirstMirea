package ru.mirea.task3.human;

public class Leg {
    private char side = 'l';
    protected int size = 0;
    protected float length = 0f;

    public Leg(int size, float length, char side) {
        this.size = size;
        this.length = length;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "side=" + side +
                ", size=" + size +
                ", length=" + length +
                '}';
    }

    public char getSide() {
        return side;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}