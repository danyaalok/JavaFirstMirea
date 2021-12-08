package ru.mirea.task21;

import java.util.ArrayList;
import java.util.Arrays;

class Subway {
    ArrayList<String> lines;

    public Subway() {
        lines = new ArrayList<>(Arrays.asList("Zamoskworetskaya", "Tagansko_Krasnopresneskaya", "Kalininskaya", "Serpukhovsko-Timiryaztvskaya",
                "Lyublinskaya", "Arbatsko-Pokrovskaya", "Sokolnicheskaya", "Koltsevaya", "Kaluzsko-Rizhskaya", "Filyovskaya"));
    }

        public void printLines(boolean a) {
            if (a==true)// выведем четные номера
            for (int i=0; i<lines.size();i+=2) System.out.println(lines.get(i));

            else for (int i = 1; i < lines.size();i+=2) System.out.println(lines.get(i));
    }
}

public class Main {
    public static void main(String[] args) {
        Subway subway = new Subway();
        subway.printLines(false);
    }
}