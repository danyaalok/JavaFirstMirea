package ru.mirea.task5.Furniture;

public class Chair extends Furniture {
    private boolean forGamers;
    private boolean footrest;

    Chair(String size, String material, float weight, float cost,
          boolean sold, boolean forGamers, boolean footrest)
    {
        super(size, material, weight, cost, sold);
        this.forGamers = forGamers;
        this.footrest = footrest;
    }

    public boolean isForGamers() {
        return forGamers;
    }

    public void setForGamers(boolean forGamers) {
        this.forGamers = forGamers;
    }

    public boolean isFootrest() {
        return footrest;
    }

    public void setFootrest(boolean footrest) {
        this.footrest = footrest;
    }

    @Override
    public String action() {
        if (footrest) return "Можно сидеть";
        else return "Можно сидеть и лежать";
    }

    @Override
    public String thing() {
        return "Стул";
    }

    @Override
    public String toString() {
        return "Характеристики стула:\n"
                + super.toString()
                + "\nИгровой= " + ((forGamers) ? "Да" : "Нет")
                + "\nЕсть подставка для ног= " + ((footrest) ? "Да" : "Нет")
                + "\n";
    }
}