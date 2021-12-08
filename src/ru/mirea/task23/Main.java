package ru.mirea.task23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr_1 = new ArrayList<>();
        ArrayList<Integer> arr_2 = new ArrayList<>();

        String str_1 = "Hello";
        String str_2 = "World";
        String str_3 = "Danya";
        String str_4 = "Chistyakov";
        String str_5 = "Mirea";

        System.out.print(str_1.hashCode() + " " + str_2.hashCode() + " : ");
        System.out.println(str_1.hashCode() == str_2.hashCode());


        System.out.print(str_2.hashCode() + " " + str_3.hashCode() + " : ");
        System.out.println(str_2.hashCode() == str_3.hashCode());

        System.out.print(str_3.hashCode() + " " + str_4.hashCode() + " : ");
        System.out.println(str_3.hashCode() == str_4.hashCode());

        System.out.print(str_4.hashCode() + " " + str_5.hashCode() + " : ");
        System.out.println(str_4.hashCode() == str_5.hashCode());

        System.out.print(arr_1.hashCode() + " " + arr_2.hashCode() + " : ");
        System.out.println(arr_1.hashCode() == arr_2.hashCode());
    }
}
