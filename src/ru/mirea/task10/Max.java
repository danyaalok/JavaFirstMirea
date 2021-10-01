package ru.mirea.task10;

import java.util.Scanner;

public class Max {

    public Max() {}

    public int task() {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        if (numb==0) return 0;
        else
            return Math.max(numb,task());
    }

    public static void main(String[] args) {
        Max a = new Max();
        System.out.print(a.task());
    }
}
