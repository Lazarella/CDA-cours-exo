package exercice8;

import org.example.exercice8.entity.Roll;
import org.example.exercice8.entity.RowType;
import org.example.exercice8.entity.Frame;
import org.example.exercice8.entity.PlayerThrow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FrameTest {
    private Frame frame;
    private Roll roll;
   @Mock
   private PlayerThrow playerThrow;

   @BeforeEach
   void init(){
       Frame frame = new Frame();
   }

   //Série Standard

    //identifier le premier lancé
    @Test
    void testPlayerThrowIsFirst(){
        Frame frame = new Frame();
        Mockito.when(playerThrow.getScore()).thenReturn(5);
        Roll roll = new Roll(playerThrow.getScore());
        frame.start(roll);
        RowType result = roll.getTypeOfRow();
        Assertions.assertEquals(RowType.FIRST, result );
    }

    //Le premier lancer d’une série doit augmenter le score de la série
    @Test
    void testFirstThrowIncreaseRoundScore(){
        Frame frame = new Frame();
        Roll roll = new Roll(playerThrow.getScore());
        frame.start(roll);
        Mockito.when(playerThrow.getScore()).thenReturn(5);
        int result = frame.setScore(playerThrow.getScore());
        Assertions.assertEquals(5, result);

    }
   //identifier le second tour
   @Test
   void testPlayerThrowIsSecond(){
       Frame frame = new Frame();
       Roll roll = new Roll(playerThrow.getScore());
       frame.regularRow(roll);

       Assertions.assertEquals(RowType.SECOND, roll.getTypeOfRow() );
   }

    //Le second lancer d’une série doit augmenter le score de cette série
    @Test
    void testSecoundThrowIncreaseRoundScore(){
        Frame frame = new Frame();
        Mockito.when(playerThrow.getScore())
                .thenReturn(5)
                .thenReturn(8);
        Roll roll1 = new Roll(playerThrow.getScore());
        Roll roll2 = new Roll(playerThrow.getScore());
        int score1 = frame.start(roll1);
        int score2 = frame.regularRow(roll2);

        int totalScore = frame.getScore();

        Assertions.assertEquals(13, totalScore);

    }
    // Le lancer est-il un Strike?
    @Test
    void testPlayerRollIsAStrike(){
        Frame frame = new Frame();
        Mockito.when(playerThrow.getScore())
                .thenReturn(10);
        Roll roll = new Roll(playerThrow.getScore());
        frame.start(roll);

        Assertions.assertTrue(roll.getScore()>=10);

    }
    // En cas de strike, il ne doit pas être possible de lancer de nouveau au cours de cette même série.
    @Test
    void testFrameEndingWhenStrikeIsTrue(){
    Frame frame = new Frame();
        Mockito.when(playerThrow.getScore())
                .thenReturn(13)
                .thenReturn(5);
    Roll roll = new Roll(playerThrow.getScore());
    Roll roll2 = new Roll(playerThrow.getScore());
        frame.gameOn(roll, roll2);

        Assertions.assertEquals(13,frame.getScore() );
}
    //En cas de lancers standards, il ne doit pas être possible de lancer plus de 2 fois
@Test
void testNoMoreThenTwoThrowWhenRegularRoll(){
    Frame frame = new Frame();
    Mockito.when(playerThrow.getScore())
            .thenReturn(9)
            .thenReturn(4)
            .thenReturn(20);
    Roll roll = new Roll(playerThrow.getScore());
    Roll roll2 = new Roll(playerThrow.getScore());
    Roll roll3 = new Roll(playerThrow.getScore());
    frame.gameOn(roll, roll2);

    Assertions.assertEquals(13,frame.getScore() );
}

// Final Round

    //Est-ce un final round?

        @Test
        void testPlayerThrowIsFinal(){
            Frame frame = new Frame();
            Mockito.when(playerThrow.getScore()).thenReturn(5);
            Roll roll = new Roll(playerThrow.getScore());
            frame.finalRoll(roll);
            RowType result = roll.getTypeOfRow();
            Assertions.assertEquals(RowType.FINAL, result );
        }


    //En cas de strike, il doit être possible de lancer une nouvelle fois au cours d’une série
    @Test
    void testThrowAfterStrikeWhenFinalRound(){

    }




}
