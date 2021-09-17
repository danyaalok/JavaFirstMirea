package ru.mirea.task5;

class Beagle extends Dog {
    protected String name;
    protected int weight;
    protected String color;

    Beagle() {}

    Beagle (String name, int weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    Beagle (String name, char sex, int age, int weight, String color){
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.sex=sex;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sex=" + sex +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}