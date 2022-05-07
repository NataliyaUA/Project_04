import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {
    @Test
    public void testBiggerValueTestHappyPassPositiveBBiggerA() {

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);


    }
    @Test
    public void testBiggerValueTestHappyPassPositiveABiggerB() {

        int a = 14000;
        int b = 1400;
        int expectedResult = 14000;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testBiggerValueTestHappyPassNegativeBBiggerA() {

        int a = -300;
        int b = -55;
        int expectedResult = -55;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueTestHappyPassNegativeABiggerB() {

        int a = -2;
        int b = -15;
        int expectedResult = -2;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueTestAEqualsBPositiveNumbers() {

        int a = 4545;
        int b = 4545;
        int expectedResult = 0;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }


}
