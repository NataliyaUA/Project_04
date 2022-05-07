import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementTest {
    @Test
    public void testPeakElementTestHappyPassPositiveNumbers()  {
       int [] array = {3, 2, 7, 5, 1, 9, 23, 1};
       int [] expectedResult = {3, 7, 23};

        PeakElement pE = new PeakElement();
        int [] actualResult = pE.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testPeakElementTestHappyPassNegativeNumbers() {
        int[] array = {3, -2, 7, 5, 1, 9, -23, 1};
        int[] expectedResult = {3, 7, 9};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementTestSimilarElements() {
        int[] array = {3, 3, 3, 3, 3, 3};
        int[] expectedResult = {};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.PeakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}


