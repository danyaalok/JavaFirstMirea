package ru.mirea.task4;

public class BallTest {
    public static void main(String[] args) {
        Ball b = new Ball(0, 0);
        System.out.println(b);
        b.move(1.5, 3.2);
        System.out.println(b);
    }
}