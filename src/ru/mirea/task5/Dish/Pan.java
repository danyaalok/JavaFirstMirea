package ru.mirea.task5.Dish;

class Pan extends Dish {
    protected int handle;

    Pan() {}

    Pan(int handle, String type, String material){
        this.handle = handle;
        this.type = type;
        this.material = material;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", handle=" + handle +
                '}';
    }
}
