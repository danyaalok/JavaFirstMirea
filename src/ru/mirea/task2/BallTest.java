package ru.mirea.task2;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball ("volleyball");

        ball.setType("volleyball");
        System.out.println("Type of the ball: " + ball.getType());
    }
}