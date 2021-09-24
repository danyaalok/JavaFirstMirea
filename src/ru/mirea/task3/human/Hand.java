package ru.mirea.task3.human;

public class Hand {
    private char side = 'l';
    protected int valOfFinger = 10;
    protected float length = 0.0f;

    public Hand(int valOfFinger, float length, char side) {
        this.valOfFinger = valOfFinger;
        this.length = length;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "side=" + side +
                ", valOfFinger=" + valOfFinger +
                ", length=" + length +
                '}';
    }

    public char getSide() {
        return side;
    }


    public int getValOfFinger() {
        return valOfFinger;
    }

    public void setValOfFinger(int valOfFinger) {
        this.valOfFinger = valOfFinger;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void flap () {};
}