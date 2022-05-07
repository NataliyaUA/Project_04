import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {
    @Test
    public void testAreNumbersEqualTestAEqualsB (){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual nE = new AreNumbersEqual();
        int actualResult = nE.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testAreNumbersEqualTestALesserB (){
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual nE = new AreNumbersEqual();
        int actualResult = nE.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testAreNumbersEqualTestABiggerB (){
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual nE = new AreNumbersEqual();
        int actualResult = nE.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
