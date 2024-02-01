package org.example.exercice8.entity;

public class Roll {
    private RowType typeOfRow;
    private int score;

    public Roll(int score) {
        this.score = score;
    }

    public void setTypeOfRow(RowType typeOfRow) {
        this.typeOfRow = typeOfRow;
    }

    public RowType getTypeOfRow() {
        return typeOfRow;
    }

    public int getScore() {
        return score;
    }
}
