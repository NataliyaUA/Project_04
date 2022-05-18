import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_14_CompareTwoLettersTest {
    @Test
    public void testCompareTwoLettersFirstLetterLess() {
        String a = "a";
        String b = "m";

        boolean expectedResult = true;

        String_14_CompareTwoLetters cTl = new String_14_CompareTwoLetters();
        boolean actualResult = cTl.CompareTwoLettersAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertTrue(actualResult);

    }
    @Test
    public void testCompareTwoLettersSecondLetterLess() {
        String a = "m";
        String b = "l";

        boolean expectedResult = false;

        String_14_CompareTwoLetters cTl = new String_14_CompareTwoLetters();
        boolean actualResult = cTl.CompareTwoLettersAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertFalse(actualResult);

    }
}
