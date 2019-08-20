package com.db.studies.w1d1.guess_game;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();

        String maxNumberString = JOptionPane.showInputDialog("Write max game number");

        int maxNumber = Integer.parseInt(maxNumberString);
        boolean continueGame = true;
        do{
            guessGame.play(maxNumber);
            guessGame.printBestScore();
            String userAnswer = JOptionPane.showInputDialog("Write your guess");
            if (!userAnswer.toLowerCase().equals("yes")){
                continueGame = false;
            }
        } while(continueGame);
    }
}
