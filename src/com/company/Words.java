package com.company;

import java.util.Random;

public class Words {

    private String[] randomwords = {"happiness", "randomness", "agility","birthday", "late","laziness", "staedy", "animals","chidish","dessert","beneath","independence","ceremony",
    "rights", "wrong","information","influencer","beauty","phone","parrot","peacock","infants","bucks"};

    private String selectedWord;

    private Random random = new Random();

    private char[] letters;

    public Words(){
        selectedWord = randomwords[random.nextInt(randomwords.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString() {

        //String word = "";
        StringBuilder text = new StringBuilder();
        //letters[1] = 'a';

        for(char letter:letters) {

            text.append(letter == '\u0000' ? '-': letter);
            text.append(' ');
        }
        return text.toString();
    }
    public boolean isGuessedRight() {
        for(char letter: letters){
            if(letter == '\u0000') {
                return false;
            }
        }
        return true;
    }
    public boolean guess(char letter) {

        boolean GuessedRight = false;
        for(int i=0;i<selectedWord.length();i++){
            if(letter == selectedWord.charAt(i)) {
                letters[i] = letter;
                GuessedRight = true;
            }
        }
        return GuessedRight;
    }
}
