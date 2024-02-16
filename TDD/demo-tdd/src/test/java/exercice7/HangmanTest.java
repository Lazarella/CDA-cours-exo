package exercice7;

import org.example.exception.LoseException;
import org.example.exercice7.entity.Hangman;
import org.example.exercice7.entity.WordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

@ExtendWith(MockitoExtension.class)
public class HangmanTest {

    @Mock
    private WordGenerator wordGenerator;
    private Hangman hangman;

    @BeforeEach
    void setUp() {
        Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman = new Hangman(wordGenerator);
        hangman.makeMask();
    }

    @Test
    void testConvertWordToMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        //hangman.makeMask();
        Assertions.assertEquals("______", hangman.getMask());
    }
    @Test
    void testTryCharWithCorrectChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = hangman.tryChar('g');
        Assertions.assertTrue(result);
    }
    @Test
    void testTryCharWithWrongChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = hangman.tryChar('t');
        Assertions.assertFalse(result);
    }

    @Test
    void testTryCharWithCorrectCharShouldNotUpdateTryValue() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        int tryNumber = hangman.getTryNumber();
        hangman.tryChar('g');
        Assertions.assertEquals(tryNumber, hangman.getTryNumber());
    }

    @Test
    void testTryCharWithWrongCharShouldNotDecreaseTryValue() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        int tryNumber = hangman.getTryNumber();
        hangman.tryChar('a');
        Assertions.assertEquals(tryNumber-1, hangman.getTryNumber());
    }

    @Test
    void testTryCharWithCorrectCharShouldUpdateMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman.tryChar('g');
        Assertions.assertEquals("g__g__", hangman.getMask());
    }

    @Test
    void testTryCharWithWrongCharShouldNotUpdateMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman.tryChar('g');
        hangman.tryChar('a');
        Assertions.assertEquals("g__g__", hangman.getMask());
    }
    @Test
    void testVictoryWhenCheckVictoryWithWrongMask() {
        //Arrange
        hangman.tryChar('g');

        //Act
        boolean res = hangman.isWinner();

        Assertions.assertFalse(res);
    }
    @Test
    void testTryCharRaiseExceptionWhenTryNumberIs0() {

        //Arrange
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');

        //Act
        Assertions.assertThrowsExactly(LoseException.class, () -> {
            hangman.tryChar('c');
        });
    }

    @Test
    void testCheckVictoryRaiseExceptionWhenTryNumberIs0() {

        //Arrange
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');
        hangman.tryChar('c');

        //Act
        Assertions.assertThrowsExactly(LoseException.class, () -> {
            hangman.isWinner();
        });
    }

}
