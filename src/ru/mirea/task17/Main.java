package ru.mirea.task17;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

enum Planet {
    Mercury(3.302e23, 2440), Venus(4.869e24, 6052), Earth(5.974e24, 6378), Mars(6.419e23, 3397),
    Jupiter(1.899e27, 71490), Saturn(5.685e26, 60270), Uranus(8.685e25, 25560), Neptune(1.024e26, 24760);

    private double G = 6.67408e-11;
    private double weight, radius, force;
    Planet(double w, double r) {
        weight = w;
        radius = r;
        force = (G*weight)/(radius*radius)/1000000;
    }

    public double getForce() { return force; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planet;
        while (true) {
            System.out.println("Enter the planet: ");
            planet = sc.nextInt();
            Planet pl;
            if (planet < 8) {
                System.out.println("Planet: " + Planet.values()[planet].name());
                System.out.println("Force of a gravity: " + Planet.values()[planet].getForce() + " m/s^2");
            } else System.out.println("There're no planet with that number!");
        }
    }
}
