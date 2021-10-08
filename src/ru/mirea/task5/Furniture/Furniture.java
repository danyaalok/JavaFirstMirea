package ru.mirea.task5.Furniture;

public abstract class Furniture {
    protected String size;
    protected String material;
    protected float weight;
    protected float cost;
    protected boolean sold;

    Furniture(String size, String material, float weight, float cost, boolean sold) {
        this.size = size;
        this.material = material;
        this.weight = weight;
        this.cost = cost;
        this.sold = sold;
    }

    public void sell() {this.sold = true;};

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isSold() {
        return sold;
    }

    public abstract String thing();
    public abstract String action();

    @Override
    public String toString() {
        return  "размер= " + size +
                ",\nматериал= " + material +
                ",\nвес= " + weight +
                ",\nцена= " + cost +
                ",\nпродан= " + ((sold) ? "Да" : "Нет");
    }
}