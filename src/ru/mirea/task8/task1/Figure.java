package ru.mirea.task8.task1;

import java.util.ArrayList;

public class Figure extends Shape {
    protected int[] _x;
    protected int[] _y;
    protected int n;
    Figure(){}

    public void SetColor(){
        int min = 0;
        int max = 255;
        this.r = min + (int)(Math.random()*(max-min+1));
        this.g = min + (int)(Math.random()*(max-min+1));
        this.b = min + (int)(Math.random()*(max-min+1));
    }

    public void SetSize(){
        n = (int)(Math.random()*6);
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        int min=0;
        int max=800;
        for (int i=0;i<n;i++){
            x.add(min + (int)(Math.random()*(max-min+1)));
            y.add(min + (int)(Math.random()*(max-min+1)));
        }
        this._x = x.stream().mapToInt(j->j).toArray();
        this._y = y.stream().mapToInt(j->j).toArray();
    }
}
