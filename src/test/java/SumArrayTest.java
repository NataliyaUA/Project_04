import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SumArrayTest {
    @Test
    public void testSumArrayHappyPassSumOfPositiveNumbers(){
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;


        SumArray sA = new SumArray();
        int actualResult = sA.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testSumArrayHappyPassSumOfNegativeNumbers(){
        int[] array = {-7, -3, - 12, -20};
        int expectedResult = -42;


        SumArray sA = new SumArray();
        int actualResult = sA.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumArraySumOfPositiveNegativeNumbers(){
        int[] array = {-7, -3, 12, -20, 5};
        int expectedResult = -13;


        SumArray sA = new SumArray();
        int actualResult = sA.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumArrayOfZeroIndices(){
        int[] array = {};
        int expectedResult = 0;


        SumArray sA = new SumArray();
        int actualResult = sA.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testSumArrayOfIntegerMax(){
        int[] array = {2147483647, 1};
        int expectedResult = -2147483648;


        SumArray sA = new SumArray();
        int actualResult = sA.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
