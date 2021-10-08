package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        int i = 0;
        Random rand = new Random();
        for (i = 0; i < 10; i++)
            a[i] = rand.nextInt(10);

        int s = 0;
        for (i = 0; i < a.length; i++)
            s += a[i];
        System.out.println(s);

        s = 0;
        i = 0;
        while(i < a.length) {
            s += a[i];
            i++;
        }
        System.out.println(s);

        s = 0;
        i = 0;
        do{
            s += a[i];
            i++;
        }while(i < a.length);
        System.out.println(s);

    }
}

class Main1 {
    public static void main(String[] args) {
        for (String str : args)
            System.out.println("argument = " + str);
    }
}

class Main2 {
    public static void main(String[] args) {
        for (float i = 1; i <= 10; i++)
            System.out.println(1/i);
    }
}

class Main3 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int i = 0;
        Random rand = new Random();
        for (i = 0; i < 10; i++)
            a[i] = rand.nextInt(10);

        for (i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        Arrays.sort(a);
        for (i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}

class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt(), s = 1;
        for (int i = 2; i <= a; i++)
            s *= i;
        System.out.print(s);
    }
}
