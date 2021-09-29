package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame {
    String team_name_1 = "Russia";
    String team_name_2 = "Italy";
    int team_1=0;
    int team_2=0;
    JPanel[] pnl = new JPanel[4];
    JLabel result = new JLabel();

    public Window() {
        setLayout(new GridLayout(2,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        for (int i=0;i< pnl.length;i++){
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(210,200,255));
            add(pnl[i]);
        }

        pnl[0].setLayout(new BorderLayout());
        pnl[0].add(new JLabel("Result: " + team_1 + " " + team_2, SwingConstants.CENTER));

        pnl[1].setLayout(new BorderLayout());
        pnl[1].add(new JLabel("Last Scorer: ", SwingConstants.CENTER));

        pnl[2].setLayout(new BorderLayout());
        JButton button_1 = new JButton("Team_1");
        ActionListener action_1 = new Action_1();
        button_1.addActionListener(action_1);

        JButton button_2 = new JButton("Team_2");
        ActionListener action_2 = new Action_2();
        button_2.addActionListener(action_2);

        pnl[2].add(button_1, BorderLayout.WEST);
        pnl[2].add(button_2, BorderLayout.EAST);

        pnl[3].setLayout(new BorderLayout());
        pnl[3].add(new JLabel("Winner: ", SwingConstants.CENTER));

        setSize(500,500);
        setVisible(true);
    }

    public class Action_1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team_1++;
            pnl[0].removeAll();
            JLabel result = new JLabel("Result: " + team_1 + " " + team_2, SwingConstants.CENTER);
            pnl[0].add(result);
            pnl[0].updateUI();

            pnl[1].removeAll();
            pnl[1].add(new JLabel("Last scorer: " + team_name_1, SwingConstants.CENTER));
            pnl[1].updateUI();

            if (team_1 == 10){
                team_2 = 10;
                pnl[3].removeAll();
                pnl[3].add(new JLabel("Winner: " + team_name_1 + "!!", SwingConstants.CENTER));
                pnl[3].updateUI();
            }

            if (team_1 == 11) {
                team_1 = 0;
                team_2 = 0;
                pnl[0].removeAll();
                result.setText("Result: " + team_1 + " " + team_2);
                pnl[0].add(result);
                pnl[0].updateUI();

                pnl[1].removeAll();
                pnl[1].add(new JLabel("Last scorer: ", SwingConstants.CENTER));
                pnl[1].updateUI();

                pnl[3].removeAll();
                pnl[3].add(new JLabel("Winner: ", SwingConstants.CENTER));
                pnl[3].updateUI();
            }
        }
    }

    public class Action_2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team_2++;
            pnl[0].removeAll();
            JLabel result = new JLabel("Result: " + team_1 + " " + team_2, SwingConstants.CENTER);
            pnl[0].add(result);
            pnl[0].updateUI();

            pnl[1].removeAll();
            pnl[1].add(new JLabel("Last scorer: " + team_name_2, SwingConstants.CENTER));
            pnl[1].updateUI();

            if (team_2 == 10){
                team_1 = 10;
                pnl[3].removeAll();
                pnl[3].add(new JLabel("Winner: " + team_name_2 + "!!", SwingConstants.CENTER));
                pnl[3].updateUI();
            }

            if (team_2 == 11) {
                team_1 = 0;
                team_2 = 0;
                pnl[0].removeAll();
                result.setText("Result: " + team_1 + " " + team_2);
                pnl[0].add(result);
                pnl[0].updateUI();

                pnl[1].removeAll();
                pnl[1].add(new JLabel("Last scorer: ", SwingConstants.CENTER));
                pnl[1].updateUI();

                pnl[3].removeAll();
                pnl[3].add(new JLabel("Winner: ", SwingConstants.CENTER));
                pnl[3].updateUI();
            }
        }
    }

    public static void main(String[] args) {
        new Window();
    }
}