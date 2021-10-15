package ru.mirea.task13;

import javax.swing.*;
import java.awt.event.MouseListener;
import java.util.*;

public class Main {
    public void ArrayTest() {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Tom");
        a.add("Ann");
        a.add("Sam");
        a.add(1,"Kate");
        for (String i:a) System.out.println(i);

        System.out.println();
        System.out.println(a.get(2));
        a.set(2,"Peter");
        System.out.printf("There're %d elements \n", a.size());
        for(String i:a) System.out.println(i);
        if (a.contains("Kate")) System.out.println("Kate has been found in Array");
        a.remove("Ann");
        a.remove(3);

        for(String i:a) System.out.println(i);
    }

    public void LinkedTest() {
        LinkedList<String> a = new LinkedList<String>();

        a.add("Tom");
        a.add("Ann");
        a.add("Sam");
        a.addLast("Kate");
        a.addFirst("Boris");
        a.add(1,"Misha");
        for (String i:a) System.out.println(i);

        System.out.printf("There're %d elements \n", a.size());
        System.out.println(a.get(2));
        a.set(1,"Danya");
        for (String i:a) System.out.println(i);

        a.remove("Ann");
        a.removeFirst();
        a.removeLast();
        for (String i:a) System.out.println(i);
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println("");
        test.ArrayTest();
        test.LinkedTest();
    }
}