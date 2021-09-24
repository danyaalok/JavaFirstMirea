package ru.mirea.task3.human;

public class Body {
    protected float waistLength = 0.0f;
    protected float chestLength = 0.0f;

    Body (float waistLength, float chestLength){
        this.waistLength = waistLength;
        this.chestLength = chestLength;
    }

    @Override
    public String toString() {
        return "Body{" +
                "waistLength=" + waistLength +
                ", chestLength=" + chestLength +
                '}';
    }

    public float getWaistLength() {
        return waistLength;
    }

    public void setWaistLength(float waistLength) {
        this.waistLength = waistLength;
    }

    public float getChestLength() {
        return chestLength;
    }

    public void setChestLength(float chestLength) {
        this.chestLength = chestLength;
    }
}