package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class DogTest {

    public static void addDog (ArrayList array) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите кличку собаки и ее возраст через пробел: ");
            String name = in.next();
            int age = in.nextInt();
            array.add(new Dog(name, age));
            System.out.println("Новый объект добавлен");
            System.out.print("Хотите добавить собаку? (да/нет): ");
            if (in.next().equals("нет")) break;
        }
    }

    public static void main(String[] args) {
        ArrayList<Dog> array = new ArrayList<>(0);
        addDog(array);
        System.out.println(array);
    }
}