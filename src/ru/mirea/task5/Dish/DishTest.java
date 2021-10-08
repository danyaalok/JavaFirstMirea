package ru.mirea.task5.Dish;

public class DishTest {
    public static void main(String[] args) {
        Dish cup = new Cup(10,"for tea","glass");
        System.out.println(cup);

        Dish pan = new Pan(5,"for cooking","iron");
        System.out.println(pan);
    }
}
