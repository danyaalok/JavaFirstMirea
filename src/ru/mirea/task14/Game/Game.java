package ru.mirea.task14.Game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Game {

    private int NUMBER_OF_CARDS;
    String[] playerOneDeck, playerTwoDeck;

    public Game(int cardNum, String[] playerOneDeck, String[] playerTwoDeck){
        NUMBER_OF_CARDS = cardNum;
        this.playerOneDeck = playerOneDeck;
        this.playerTwoDeck = playerTwoDeck;
    }

    public String run(){
        Stack<Integer> firstPlayerCards = new Stack<>();
        Stack<Integer> secondPlayerCards = new Stack<>();
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            firstPlayerCards.push(Integer.parseInt(playerOneDeck[NUMBER_OF_CARDS / 2 - i - 1]));
        }
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            secondPlayerCards.push(Integer.parseInt(playerTwoDeck[NUMBER_OF_CARDS / 2 - i - 1]));
        }
        int turnCount = 0;
        while (!firstPlayerCards.empty() && !secondPlayerCards.empty()) {
            if (turnCount >= 106)
                return ("botva");

            int firstPlayerCard = firstPlayerCards.pop();
            int secondPlayerCard = secondPlayerCards.pop();

            if (firstPlayerCard == NUMBER_OF_CARDS - 1 && secondPlayerCard == 0){
                secondPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
            }
            else
                if (firstPlayerCard == 0 && secondPlayerCard == NUMBER_OF_CARDS - 1){
                    firstPlayerCards.add(0, firstPlayerCard);
                    firstPlayerCards.add(0, secondPlayerCard);
                }
                else
                    if (firstPlayerCard < secondPlayerCard) {
                        secondPlayerCards.add(0, firstPlayerCard);
                        secondPlayerCards.add(0, secondPlayerCard);
                    }
                    else {
                        firstPlayerCards.add(0, firstPlayerCard);
                        firstPlayerCards.add(0, secondPlayerCard);
                    }
            ++turnCount;
        }
        if (firstPlayerCards.empty()) {
            return ("Победил игрок под номером 2\nКоличество ходов: " + turnCount);
        } else if (secondPlayerCards.empty()) {
            return ("Победил игрок под номером 1\nКоличество ходов: " + turnCount);
        }
        return "";
    }
}