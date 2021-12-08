package ru.mirea.task18;

import java.util.Scanner;

public class Store {
    String product;

    public void menu() { // начальный запрос данных
        System.out.println("Hello, darling!");
        choose();

        try {
            order();
        } catch(IllegalAccessException exc) {
            exc.printStackTrace();
            System.exit(-1);
        }
    }

    public void choose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What product you'd like to buy, darling? ");
        product = sc.nextLine();
    }

    public void order() throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        String INN;
        String FullName;

        System.out.println("Enter your FullName, darling: ");
        FullName = sc.nextLine();

        System.out.println("Enter your INN, darling: ");
        INN = sc.next();

        if ((INN.length() < 12) || (INN.length() > 12)) throw new IllegalAccessException("Wrong INN!");

        System.out.println("You'are successfully bought the product, darling! See u soon!");
    }

    public static void main(String[] args) {
        Store st = new Store();
        st.menu();
    }
}
