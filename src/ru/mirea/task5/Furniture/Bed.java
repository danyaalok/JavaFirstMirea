package ru.mirea.task5.Furniture;

public class Bed extends Furniture{
    private boolean layOut;
    private String  space;

    public Bed(String size, String material, float weight, float cost, boolean sold, boolean layOut, String space) {
        super(size, material, weight, cost, sold);
        this.layOut = layOut;
        this.space = space;
    }

    public boolean isLayOut() {
        return layOut;
    }

    public void setLayOut(boolean layOut) {
        this.layOut = layOut;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    @Override
    public String action() {
        return "Можно лежать и спать";
    }

    @Override
    public String thing() {
        return "Кровать";
    }

    @Override
    public String toString() {
        return "Характеристики кровати:\n"
                + super.toString()
                + "\nРаскладывается= " + ((layOut) ? "Да" : "Нет")
                + "Тип кровати= " + space
                + "\n";
    }
}