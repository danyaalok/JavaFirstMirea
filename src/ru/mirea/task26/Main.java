package ru.mirea.task26;

import java.util.Scanner;

interface Payment { public void pay(String product); }

class E_wallet implements Payment {
    public void pay(String product) {
        System.out.println("You've chosen a " + product);
        System.out.println("Your order has been paid by an e_wallet!");
    }
}

class Credit implements Payment {
    public void pay(String product) {
        System.out.println("You've chosen a " + product);
        System.out.println("Your order has been paid by a credit card");
    }
}

class Store {
    String product, wallet;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Hello, darling!");
        System.out.println("What product would you like to buy?");

        product = sc.nextLine();

        System.out.println("Our ways of payment:");
        System.out.println("E_wallet || Credit");
        System.out.print("Choose the way to pay your order: ");
        wallet = sc.nextLine();

        switch (wallet) {
            case "E_wallet":
                Payment e_wallet = new E_wallet();
                e_wallet.pay(product);
                break;

            case "Credit":
                Payment credit = new Credit();
                credit.pay(product);
                break;

            default:
                System.out.println("Error! This type of payment isn't supported!");
                break;
        }

        return;
    }
}

public class Main {
    public static void main(String[] args) {
        Store st = new Store();
        st.start();
    }
}