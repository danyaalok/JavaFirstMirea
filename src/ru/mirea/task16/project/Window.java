package ru.mirea.task16.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Heroes { Wolf, Rabbit }

public class Window extends JFrame { // Main menu
    JPanel[] main_pnl = new JPanel[1];
    Heroes hero;

    public Window() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        main_pnl[0] = new JPanel();
        add(main_pnl[0]);
        main_pnl[0].setBackground(new Color(200,200,100));

        JButton button_1 = new JButton("START GAME");
        button_1.setBackground(new Color(100,150,100));
        button_1.setBorderPainted(false);
        button_1.setFocusPainted(false);
        ActionListener action = new Action();
        button_1.addActionListener(action);
        main_pnl[0].add(button_1, BorderLayout.CENTER);

        setSize(1000,500);
        setVisible(true);
    }

    public class Action implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            PickHero pick = new PickHero();
        }
    }

    class PickHero extends JFrame { // Choose the hero
        JPanel[] pnl = new JPanel[4];

        public PickHero() {
            setLayout(new GridLayout(2,2));
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            for (int i = 0; i < pnl.length; i++){
                pnl[i] = new JPanel();
                add(pnl[i]);
            }

            pnl[0].setLayout(new BorderLayout());
            pnl[0].add(new JLabel("WOLF", SwingConstants.CENTER));

            pnl[1].setLayout(new BorderLayout());
            pnl[1].add(new JLabel("Rabbit",SwingConstants.CENTER));

            pnl[2].setLayout(new BorderLayout());
            JButton button_1 = new JButton("WOLF");
            button_1.setBorderPainted(false);
            button_1.setFocusPainted(false);
            ActionListener action_1 = new Action_1();
            button_1.addActionListener(action_1);
            pnl[2].add(button_1, BorderLayout.CENTER);

            pnl[3].setLayout(new BorderLayout());
            JButton button_2 = new JButton("RABBIT");
            button_2.setBorderPainted(false);
            button_2.setFocusPainted(false);
            ActionListener action_2 = new Action_2();
            button_2.addActionListener(action_2);
            pnl[3].add(button_2, BorderLayout.CENTER);

            setSize(1000,500);
            setVisible(true);
        }

        public class Action_1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero = Heroes.Wolf;

            }
        }

        public class Action_2 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero = Heroes.Rabbit;

            }
        }
    }

    public static void main(String[] args) { Window obj = new Window(); }
}