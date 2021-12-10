package ru.mirea.task27;

import java.util.*;
import java.util.stream.Collectors;

class task1 {
    task1() {
        Map<String, String> Names = new HashMap<>();

        Names.put("Chistyakov", "Daniil");
        Names.put("Kozlov", "Mikhail");
        Names.put("Karpov", "Daniil");
        Names.put("Auseitova", "Karina");
        Names.put("Bachaeva", "Anna");
        Names.put("Karpova", "Anna");
        Names.put("Korotkov", "Ilya");
        Names.put("Maslov", "Denis");
        Names.put("Sivec", "Oleg");
        Names.put("Shmat", "Aleksey");

        System.out.printf("Before: %s%n", Names);

        Set<String> existing = new HashSet<>();
        Names = Names.entrySet()
                .stream()
                .filter(entry -> existing.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.printf("After: %s%n", Names);
    }
}

class City {
    String city, country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

public class Main {
    public static void main(String[] args) {
        new task1();

        City Moscow = new City("Moscow", "Russia");
        City Rostov = new City("Rostov", "Russia");
        City Orel = new City("Orel", "Russia");

        City London = new City("London", "England");
        City Birmingem = new City("Birmingem", "England");
        City Nottingem = new City("Nottingem", "England");

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put(Moscow.country, new ArrayList<>(Arrays.asList(Moscow.city, Rostov.city, Orel.city)));
        map.put(London.country, new ArrayList<>(Arrays.asList(London.city, Nottingem.city, Birmingem.city)));
        System.out.println(map);
    }
}
