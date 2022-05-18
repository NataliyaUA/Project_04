import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_15_StringToNumbersTest {
    @Test
    public void testStringToNumbersTestHappyPass () {
        String str = "1, 2, 3, 4, 5";
        int [] expectedResult = {1, 2, 3, 4, 5};

        String_15_StringToNumbers sN = new String_15_StringToNumbers ();
        int [] actualResult = sN.StringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
