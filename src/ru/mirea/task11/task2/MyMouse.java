package ru.mirea.task11.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouse extends JFrame{

    public MyMouse() {
        setLayout(new BorderLayout());
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button1 = new JButton("West");
        button1.setFont(new Font("TimesRoman",Font.BOLD,20));
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        add(button1, BorderLayout.WEST);

        JButton button2 = new JButton("North");
        button2.setFont(new Font("TimesRoman",Font.BOLD,20));
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        add(button2, BorderLayout.NORTH);

        JButton button3 = new JButton("Center");
        button3.setFont(new Font("TimesRoman",Font.BOLD,20));
        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        add(button3, BorderLayout.CENTER);

        JButton button4 = new JButton("East");
        button4.setFont(new Font("TimesRoman",Font.BOLD,20));
        button4.setBorderPainted(false);
        button4.setFocusPainted(false);
        add(button4, BorderLayout.EAST);

        JButton button5 = new JButton("South");
        button5.setFont(new Font("TimesRoman",Font.BOLD,20));
        button5.setBorderPainted(false);
        button5.setFocusPainted(false);
        add(button5, BorderLayout.SOUTH);

        button1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog(null,"You're in West!"); }
            public void mouseExited(MouseEvent e) {}
        });

        button2.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "You're in North!"); }
            public void mouseExited(MouseEvent e) {}
        });

        button3.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "You're in Center!"); }
            public void mouseExited(MouseEvent e) {}
        });

        button4.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "You're in East!"); }
            public void mouseExited(MouseEvent e) {}
        });

        button5.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) { JOptionPane.showMessageDialog( null, "You're in South!"); }
            public void mouseExited(MouseEvent e) {}
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyMouse();
    }
}