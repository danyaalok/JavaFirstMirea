package ru.mirea.task28;

public class Car {
    String model;
    int price;
    int year;
    Type type;

    public Car(Type type, String model, int year, int price) {
        this.type = type;
        this.price = price;
        this.year = year;
        this.model = model;
    }

    public void data() { System.out.println("Car: " + model + " " + type.type + " " + type.speed + " " + year + " " + price); }

    private static class Type {
        String type;
        int speed;

        public Type(String type, int speed) {
            this.speed = speed;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Car bmw = new Car(new Type("Sedan", 200), "BMW", 2018, 5000000);
        bmw.data();

        Car mercedes = new Car(new Type("Hatchback", 180), "Mercedes", 2017, 4500000) {

            @Override
            public void data() { System.out.println("Car: " + super.model + " " + super.type.type + " " + super.type.speed + " " + super.year + " " + super.price); }
        };

        System.out.println();
        mercedes.data();
    }
}
