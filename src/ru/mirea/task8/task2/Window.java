package ru.mirea.task8.task2;

import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.io.*;


public class Window extends JFrame {

    public Window() {
        Container c = getContentPane(); // клиентская область окна
        setTitle("Example window"); // заголовок окна
        setPreferredSize(new Dimension(740, 417));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // устанавливаем желательные размер
        setVisible(true); // отображаем окно
    }
    // запуск оконного приложения
    public static void main(String args[]) {
        new Window();
    }

    public void paint(Graphics a){
        String file = "D:\\учеба\\Джава\\main.jpg";
        try {
            Image image = ImageIO.read(new File(file));
            a.drawImage(image, 0, 0, null);
        }
        catch (IOException ex){
            System.out.println("Невозможно открыть изображение");
        }
    }
}