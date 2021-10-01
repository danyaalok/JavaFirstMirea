package ru.mirea.task10;

import java.util.Scanner;

public class Countmax {

    public Countmax() {}

    public void Max(int max, int count){
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        if (x==0) System.out.println(count + 1);

        if (x==max) {
            Max(max, count + 1);
        }
        else {
            if (x > max)
                Max(x, 0);
            else {
                if (x<max)
                    Max(max,count);
            }
        }
    }

    public static void main(String[] args) {
        Countmax a = new Countmax();
        a.Max(1,0);
    }
}
