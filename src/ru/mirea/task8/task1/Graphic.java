package ru.mirea.task8.task1;

import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame{
    public Graphic(){
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String a[]){
        new Graphic();
        Figure figure;
        for (int i =0;i<20;i++) {
            figure = new Figure();
            figure.SetColor();
            figure.SetSize();
        }
    }

    public void paint(Graphics g){
        Figure figure;
        for (int i =0;i<20;i++) {
            figure = new Figure();
            figure.SetColor();
            figure.SetSize();
            g.setColor(new Color(figure.r, figure.g, figure.b));
            g.fillPolygon(figure._x, figure._y, figure.n);
        }
    }
}