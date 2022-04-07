package com.company;

import java.util.Scanner;

public class guesstheword {

    private boolean play = true;
    private Words randomwords = new Words();
    private Scanner scanner = new Scanner(System.in);
    private int rounds = 10;
    private char lastRound;

    public void start() {

        do {
            showWord();
            getInput();
            checkInput();
        } while(play);
    }
    void showWord() {
        System.out.println("You have " + rounds + " tries left.");
        System.out.println(randomwords);
    }
    void getInput() {

        System.out.println("Enter a letter to take a guess:");
        String userGuess = scanner.nextLine();
        lastRound = userGuess.charAt(0);
    }
    void checkInput() {
        boolean isGuessedRight = randomwords.guess(lastRound);

        if(isGuessedRight) {
            if (randomwords.isGuessedRight()) {
                System.out.println("Congrats You Guessed It right!");
                System.out.println("The Word is:" + randomwords);
                play = false;
            }
        }
        else {
            rounds--;

            if(rounds == 0) {
                System.out.println("Game Over");
                play=false;
            }
        }
    }
    public void end() {
        scanner.close();
    }
}
