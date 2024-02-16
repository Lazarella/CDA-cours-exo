package org.example.exercice8.entity;

public class Frame {
    private Roll roll;
    int totalScore;

    public int start(Roll roll) {
        roll.setTypeOfRow(RowType.FIRST);
        int playerThrow = roll.getScore();
        return setScore(playerThrow);
    }

    public int regularRow(Roll roll) {
        roll.setTypeOfRow(RowType.SECOND);
        int playerThrow = roll.getScore();
        return setScore(playerThrow);
    }
    public int finalRoll(Roll roll){
        roll.setTypeOfRow(RowType.FINAL);
        int playerThrow = roll.getScore();
        return setScore(playerThrow);
    }

    public void gameOn(Roll roll, Roll roll2) {
        if (roll.getTypeOfRow() == RowType.FINAL) {
// on en est là --- ಥ_ಥ
        } else {
            start(roll);
            if (roll.getScore() < 10) {
                regularRow(roll2);
            }
        }
    }

        private void setFrameIsOngoing ( boolean b){
        }

        public int setScore ( int playerThrow){
            this.totalScore += playerThrow;
            return totalScore;
        }

        public int getScore () {
            return totalScore;
        }
}

