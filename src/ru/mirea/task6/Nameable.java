package ru.mirea.task6;

public interface Nameable {
   abstract String Getname();
}

class Planet implements Nameable {
    private String name;

    public void Setname(String name) {
        this.name = name;
    }

    @Override
    public String Getname() {
        return this.name;
    }
}

class Dog implements Nameable {
    private String name;

    public void Setname(String name) {
        this.name = name;
    }

    @Override
    public String Getname() {
        return this.name;
    }
}

class Main{
    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.Setname("Earth");
        System.out.println(planet.Getname());

        Dog dog = new Dog();
        dog.Setname("Jack");
        System.out.println(dog.Getname());
    }
}
