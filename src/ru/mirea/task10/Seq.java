package ru.mirea.task10;

import java.util.Scanner;

public class Seq {

    public Seq() { task(); }

    public void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int i=1;
        while(true) {
            String numb = scanner.nextLine();
            if (numb == "0")
                break;

            else {
                if (i % 2 !=0)
                    System.out.println(i + ": " + numb);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Seq a = new Seq();
    }
}
