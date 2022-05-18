import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_8_UpperLowerCaseTest {
    @Test
    public void testUpperLowerCaseTestHappyPassFirstLetter() {
        String str = "ташкент";
        String expectedResult = "Ташкент";

        String_8_UpperLowerCase uLc = new String_8_UpperLowerCase();
        String actualResult = uLc.UpperLowerCaseAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUpperLowerCaseTestHappyPassAnyLetter() {
        String str = "ЧикаГО";
        String expectedResult = "Чикаго";

        String_8_UpperLowerCase uLc = new String_8_UpperLowerCase();
        String actualResult = uLc.UpperLowerCaseAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUpperLowerCaseTestTrimStringAnyLetter() {
        String str = "  ЧикаГО  ";
        String expectedResult = "Чикаго";

        String_8_UpperLowerCase uLc = new String_8_UpperLowerCase();
        String actualResult = uLc.UpperLowerCaseAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testUpperLowerCaseTestZeroString() {
        String str = "";
        String expectedResult = null;

        String_8_UpperLowerCase uLc = new String_8_UpperLowerCase();
        String actualResult = uLc.UpperLowerCaseAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

