package org.example.exercice7.entity;

public class Pendu {
    private WordGenerator wordGenerator;

    private String winnerWord;
    private String mask;

    public Pendu(WordGenerator wordGenerator) {
    }

    public  String getMask() {
        return mask;
    }

    public void Pendu(WordGenerator wordGenerator) {
        this.wordGenerator = wordGenerator;

    }

    public boolean tryChar(char c) {
        return true;
    }

    public void makeMask() {
        this.winnerWord = wordGenerator.getRandomWord();
        StringBuilder builder = new StringBuilder();
        for(int i=0; i < this.winnerWord.length(); i++) {
            builder.append("_");
        }
        this.mask = builder.toString();
    }

    public boolean isWinner(String playerAnswer, String randomWord) {
        return false;
    }
}

