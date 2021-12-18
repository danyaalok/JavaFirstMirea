package ru.mirea.task2;

public class Dog {
    private String name;
    private int age,human_age;

    public Dog(String name, int age){
        this.age=age;
        this.name=name;
        Human_Dog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Human_Dog(){
        this.human_age = this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", human_age=" + human_age +
                '}';
    }
}
