package exercice1;

import org.example.exercice1.entity.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class GradingCalculatorTest {
        @Test
        public void testGradeWhen95ScoreAndHighAttendance90GradeShouldBeA() { //Notation explicite
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(95);
            calculator.setAttendancePercentage(90);
            Assertions.assertEquals('A', calculator.getGrade());
        }

        @Test
        public void testGradeForGoodScoreAndHighAttendance() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(85);
            calculator.setAttendancePercentage(90);
            Assertions.assertEquals('B', calculator.getGrade());
        }

        @Test
        public void testGradeForAverageScoreAndHighAttendance() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(65);
            calculator.setAttendancePercentage(90);
            Assertions.assertEquals('C', calculator.getGrade());
        }

        @Test
        public void testGradeForHighScoreAndAverageAttendance() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(95);
            calculator.setAttendancePercentage(65);
            Assertions.assertEquals('B', calculator.getGrade());
        }

        @Test
        public void testGradeForHighScoreAndLowAttendance() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(95);
            calculator.setAttendancePercentage(55);
            Assertions.assertEquals('F', calculator.getGrade());
        }

        @Test
        public void testGradeForAverageScoreAndLowAttendance() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(65);
            calculator.setAttendancePercentage(55);
            Assertions.assertEquals('F', calculator.getGrade());
        }

        @Test
        public void testGradeForLowScoreAndHighAttendance() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(50);
            calculator.setAttendancePercentage(90);
            Assertions.assertEquals('F', calculator.getGrade());
        }

//        private void initGradingCalculator(int score, int attendance) {
//            gradingCalculator = new GradingCalculator();
//            gradingCalculator.setScore(score);
//            gradingCalculator.setAttendancePercentage(attendance);
//        }
        // cette méthode permet d'éviter de se répéter autant
    }
