package exercice7;

import org.example.exercice7.entity.Pendu;
import org.example.exercice7.entity.WordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PenduTest {
    @Mock
    private WordGenerator wordGenerator;

    private Pendu pendu ;

    @BeforeEach
    void setUp() {
        Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        pendu = new Pendu(wordGenerator);
        pendu.makeMask();
    }

    @Test
    void testConvertWordToMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        //hangman.makeMask();
        Assertions.assertEquals("______", pendu.getMask());
    }
    @Test
    void testTryCharWithCorrectChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = pendu.tryChar('g');
        Assertions.assertTrue(result);
    }
    @Test
    void testTryCharWithWrongChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = pendu.tryChar('t');
        Assertions.assertFalse(result);
    }
    @Test
    void testPlayerIsAWinner(){
        String playerAnswer = "google";
        boolean result = pendu.isWinner(playerAnswer, wordGenerator.getRandomWord());
        Assertions.assertTrue(result);
    }


}
