import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenTestHappyPassOddNumber() {

        int a = 7;
        String expectedResult = "Odd";


        OddEven oT = new OddEven();
        String actualResult = oT.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testOddEvenTestHappyPassEvenNumber() {

        int a = 10;
        String expectedResult = "Even";


        OddEven oT = new OddEven();
        String actualResult = oT.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void testOddEvenTestZero() {

        int a = 0;
        String expectedResult = "Even";


        OddEven oT = new OddEven();
        String actualResult = oT.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenTestNegativeEven() {

        int a = -100;
        String expectedResult = "Even";


        OddEven oT = new OddEven();
        String actualResult = oT.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenTestNegativeOdd() {

        int a = -11;
        String expectedResult = "Odd";


        OddEven oT = new OddEven();
        String actualResult = oT.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testOddEvenTestUndefined() {

        int a = -2147483647 - 1;
        String expectedResult = "Undefined";


        OddEven oT = new OddEven();
        String actualResult = oT.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
