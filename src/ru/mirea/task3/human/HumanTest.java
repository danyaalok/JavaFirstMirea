package ru.mirea.task3.human;

import ru.mirea.task3.human.Body;
import ru.mirea.task3.human.Hand;
import ru.mirea.task3.human.Human;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("blue", "blond", true);
        Body body = new Body(70.5f, 80.1f);
        Leg rightLeg = new Leg(45,90.6f, 'r');
        Leg leftLeg = new Leg(45,90.4f, 'l');
        Hand rightHand = new Hand(5,60.3f, 'r');
        Hand leftHand = new Hand(4,60.7f, 'l');
        Human human = new Human(head, body, rightLeg, leftLeg, rightHand, leftHand, "Henry", "male", "19.04.2000");

        System.out.println(human);
        human.head.setBeard(false);
        human.rightHand.setValOfFinger(3);
        System.out.println(human);
    }
}