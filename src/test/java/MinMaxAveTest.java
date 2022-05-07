import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
    @Test
    public void testMinMaxAveTestHappyPassPositiveNumbers() {
       int [] array ={1, 2, 3, 4, 5, 6, 7, 8};
       int n1 = 2;
       int n2 = 6;
       int [] expectedResult = {3, 7, 5};


        MinMaxAve mMa = new MinMaxAve();
        int [] actualResult = mMa.MinMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveTestHappyReversePassPositiveNumbers() {
        int [] array ={8, 7, 6, 5, 4, 3, 2 ,1};
        int n1 = 2;
        int n2 = 6;
        int [] expectedResult = {2, 6, 4};


        MinMaxAve mMa = new MinMaxAve();
        int [] actualResult = mMa.MinMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveTestHappyPassNegativeNumbers() {
        int [] array ={-1, -2, -3, -4, -5, -6, -7, -8};
        int n1 = 2;
        int n2 = 6;
        int [] expectedResult = {-7, -3, -5};


        MinMaxAve mMa = new MinMaxAve();
        int [] actualResult = mMa.MinMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }





}
