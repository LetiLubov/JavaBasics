package com.db.studies.w1d1.guess_game;

import javax.swing.*;
import java.util.Random;

public class GuessGame {
    private int max;
    private int guessedNumber;
    private int numberOfTries = 0;
    private static int bestScore = 0;
    private Random random = new Random();

    public void play(int max){
        this.max = max;
        guessedNumber = random.nextInt(max);
        System.out.println(guessedNumber);
        int userNumber;
        do{
            userNumber = Integer.parseInt(JOptionPane.showInputDialog("Write your number"));
        }while(!checkNumber(userNumber));
    }

    private boolean checkNumber(int num){
        if (num == guessedNumber){
            JOptionPane.showMessageDialog(null, "ok");
            return  true;
        } else if (num > guessedNumber){
            JOptionPane.showMessageDialog(null, "Your number is bigger");
        } else {
            JOptionPane.showMessageDialog(null, "Your number is lower");
        }
        numberOfTries++;
        return  false;
    }
    public void printBestScore(){
        int currentScore = max / numberOfTries;
        if (currentScore > bestScore){
            bestScore = currentScore;
        }
        JOptionPane.showMessageDialog(null, "Your score: " + currentScore + "\nBest score : " + bestScore);
    }
}

