package ru.mirea.task5.Dish;

class Cup extends Dish {
    private int size;

    Cup(){}

    Cup(int size, String type, String material){
        this.size = size;
        this.type = type;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
