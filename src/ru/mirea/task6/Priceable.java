package ru.mirea.task6;

public interface Priceable {
    abstract int GetPrice();
}

class Car implements Priceable {
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int GetPrice() {
        return price;
    }
}

class Flat implements Priceable {
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int GetPrice() {
        return price;
    }
}

class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPrice(1000000);
        System.out.println(car.GetPrice());

        Flat flat = new Flat();
        flat.setPrice(5000000);
        System.out.println(flat.GetPrice());
    }
}
