package ru.mirea.task3.human;

import ru.mirea.task3.human.Body;
import ru.mirea.task3.human.Hand;

public class Human {
    protected Head head;
    protected Body body;
    protected Leg rightLeg;
    protected Leg leftLeg;
    protected Hand rightHand;
    protected Hand leftHand;

    private String name = " ";
    private String sex = " ";
    private String birth = " ";

    public Human(Head head, Body body, Leg rightLeg, Leg leftLeg, Hand rightHand, Hand leftHand,
                 String name, String sex, String birth) {
        this.head = head;
        this.body = body;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.rightHand = rightHand;
        this.leftHand = leftHand;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head.toString() +
                ",\n      body=" + body.toString() +
                ",\n      rightLeg=" + rightLeg.toString() +
                ",\n      leftLeg=" + leftLeg.toString() +
                ",\n      rightHand=" + rightHand.toString() +
                ",\n      leftHand=" + leftHand.toString() +
                ",\n      name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}