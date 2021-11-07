package ru.mirea.task14.Game;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.awt.image.BufferedImage;

public class Window extends JFrame{
    private JPanel mainPanel;
    private JTextField firstCard;
    private JTextField secondCard;
    private JButton playButton;
    private JLabel firstLabel;
    private JLabel secondLabel;
    private BufferedImage background;

    public Window(String windowTitle){
        super(windowTitle);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setSizeFromBackground();

        firstCard.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                firstCard.setEditable((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar() == '\b' || e.getKeyChar() == ' ');
            }
        });

        secondCard.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                secondCard.setEditable((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar() == '\b' || e.getKeyChar() == ' ');
            }
        });
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game play = new Game(firstCard.getText().split(" ").length * 2,
                                     firstCard.getText().split(" "),
                                     secondCard.getText().split(" "));
                String result = play.run();
                JOptionPane.showMessageDialog(mainPanel, result);
                System.exit(0);
            }
        });
        this.setResizable(false);
    }

    private void setSizeFromBackground(){
        try{
            background = ImageIO.read(new File("src\\ru\\mirea\\task14\\Game\\background.png"));
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
        this.setSize(background.getWidth() + 8, background.getHeight() + 34);
    }

    public static void main(String[] args) {
        JFrame game = new Window("Пьяница");
        game.setVisible(true);
    }

    private void createUIComponents() {
        try{
            mainPanel = new JPanelWithBackground("src\\ru\\mirea\\task14\\Game\\background.png");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

        playButton = new JButton();
        playButton.setContentAreaFilled(false);
    }
}
