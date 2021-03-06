import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_13_SumOfStringValuesTest {
    @Test
    public void testSumOfStringValuesTestHappyPassLowerCase ()  {
        String str = "abc";
        int expectedResult = 294;

        String_13_SumOfStringValues sV = new String_13_SumOfStringValues();
        int actualResult = sV.SumOfStringValuesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumOfStringValuesTestHappyPassUpperCase ()  {
        String str = "ABC";
        int expectedResult = 198;

        String_13_SumOfStringValues sV = new String_13_SumOfStringValues();
        int actualResult = sV.SumOfStringValuesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumOfStringValuesNoDigits ()  {
        String str = "123";
        int expectedResult = 0;

        String_13_SumOfStringValues sV = new String_13_SumOfStringValues();
        int actualResult = sV.SumOfStringValuesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumOfStringValuesNoString ()  {
        String str = "";
        int expectedResult = 0;

        String_13_SumOfStringValues sV = new String_13_SumOfStringValues();
        int actualResult = sV.SumOfStringValuesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
