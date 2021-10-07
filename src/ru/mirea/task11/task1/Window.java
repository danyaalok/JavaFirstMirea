package ru.mirea.task11.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    int attempts=20;
    JPanel[] pnl = new JPanel[4];
    JButton button;
    JLabel attempt;
    JLabel lab;
    String mess;

    public Window() {
        setLayout(new GridLayout(2,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        for (int i=0;i<pnl.length;i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[0].setBackground(new Color(140,140,200));
        pnl[1].setBackground(new Color(140,140,200));
        pnl[2].setBackground(new Color(140,140,200));
        pnl[3].setBackground(new Color(140,140,200));

        attempt = new JLabel("Attempts: " + attempts);
        attempt.setFont(new Font("TimesRoman",Font.BOLD,20));
        pnl[0].add(attempt,SwingConstants.CENTER);
        lab = new JLabel("Result: " + mess);
        lab.setFont(new Font("TimesRoman",Font.BOLD,20));
        pnl[1].add(lab, SwingConstants.CENTER);

        button = new JButton("Let's try!");
        button.setFont(new Font("TimesRoman",Font.BOLD,30));
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        pnl[2].add(button, SwingConstants.CENTER);

        ActionListener action = new Action();
        button.addActionListener(action);

        setSize(700,600);
        setVisible(true);
    }

    public class Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = JOptionPane.showInputDialog(0,"Guess");
            int guess = Integer.parseInt(text);

            if (guess > 14) { lab.setText("Result: > ! New try!"); }

            if (guess < 14) { lab.setText("Result: < ! New try!"); }

            if (guess == 14) {
                lab.setText("The guessed number: "+ 14);
                JLabel win = new JLabel();
                win.setText("YOU WIN!");
                win.setFont(new Font("TimesRoman",Font.BOLD,20));
                pnl[3].add(win, SwingConstants.CENTER);
            }

            attempts--;
            attempt.setText("Attempts: " + attempts);

            if (attempts == 0) {
                attempts=20;
                lab.setText("Game over, you've lost the game ;(");
                button.setText("New try");
                pnl[3].removeAll();
            }
        }
    }

    public static void main(String[] args) {
        new Window();
    }
}