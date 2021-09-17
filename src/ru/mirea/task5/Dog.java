package ru.mirea.task5;

public abstract class Dog {
    protected char sex;
    protected int age;

    Dog() {}


    Dog(char sex, int age){
        this.sex = sex;
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "sex=" + sex +
                ", age=" + age +
                '}';
    }
}
