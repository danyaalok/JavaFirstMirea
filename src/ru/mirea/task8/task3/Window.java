package ru.mirea.task8.task3;

import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.io.*;

public class Window extends JFrame {

    public Window() {
        Container c = getContentPane();
        setTitle("Example window");
        setPreferredSize(new Dimension(500, 213));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new Window();
    }

    public void paint(Graphics a){
        String file = "D:\\учеба\\Джава\\gif";
        while(true) {
            for (int i = 0; i < 40; i++) {
                String file1 = file + "\\" + String.valueOf(i) + ".gif";
                try {
                    Image image = ImageIO.read(new File(file1));
                    a.drawImage(image, 0, 0, null);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                } catch (IOException ex) {
                    //System.out.println("Невозможно открыть изображение");
                }
            }
        }
    }
}