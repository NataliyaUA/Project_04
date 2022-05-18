import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_7_ConcatQuotationsTest {
    @Test
    public void testConcatQuotationsTestHappyPass()  {
        String str = "One";
        String expectedResult = "“One.”";

        String_7_ConcatQuotations cQ = new String_7_ConcatQuotations();
        String actualResult = cQ.ConcatQuotationsAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConcatQuotationsTestGapsInString()  {
        String str = "    TWO  ";
        String expectedResult = "“TWO.”";

        String_7_ConcatQuotations cQ = new String_7_ConcatQuotations();
        String actualResult = cQ.ConcatQuotationsAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
