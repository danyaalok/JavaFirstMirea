package ru.mirea.task3.human;

public class Head {
    protected String eyesColor = " ";
    protected String hairColor = " ";
    protected boolean beard = false;

    public Head(String eyesColor, String hairColor, boolean beard) {
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.beard = beard;
    }

    @Override
    public String toString() {
        return "Head{" +
                "eyesColor='" + eyesColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", beard=" + beard +
                '}';
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isBeard() {
        return beard;
    }

    public void setBeard(boolean beard) {
        this.beard = beard;
    }

    public void blink(){};
}