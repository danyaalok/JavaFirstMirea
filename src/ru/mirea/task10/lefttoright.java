package ru.mirea.task10;

import java.util.Scanner;

public class lefttoright {
    public lefttoright() {}

    public void task(int n) {
        if (n!=0) {
            System.out.print(n % 10 + " ");
            task(n/10);
        }
    }

    public static void main(String[] args) {
        lefttoright a = new lefttoright();
        a.task(1000);
    }
}
