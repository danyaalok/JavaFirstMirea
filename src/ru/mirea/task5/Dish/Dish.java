package ru.mirea.task5.Dish;

public abstract class Dish {
    protected String type;
    protected String material;

    Dish() {}

    Dish(String type, String material){
        this.material = material;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
