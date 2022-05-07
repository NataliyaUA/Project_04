import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    @Test
    public void testIntersectionTestHappyPassPositiveNumbers(){
        int [] array1 = {1, 2, 4, 5, 89};
        int [] array2 = {8, 9, 4, 2};
        int [] expectedResult = {2, 4};

        Intersection iT = new Intersection();
        int [] actualResult = iT.IntersectionAlgorithm(array1, array2 );

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testIntersectionTestHappyPassPositiveAndNegativeNumbers(){
        int [] array1 = {1, 2, 4, 5, 8, 9};
        int [] array2 = {8, 9, -4, -2};
        int [] expectedResult = {8, 9};

        Intersection iT = new Intersection();
        int [] actualResult = iT.IntersectionAlgorithm(array1, array2 );

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionTestNoEqualsNumbers(){
        int [] array1 = {1, 2, 4, 5, 89};
        int [] array2 = {8, 9, 45};
        int [] expectedResult = {};

        Intersection iT = new Intersection();
        int [] actualResult = iT.IntersectionAlgorithm(array1, array2 );

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testIntersectionZeroArrays(){
        int [] array1 = {};
        int [] array2 = {};
        int [] expectedResult = {};

        Intersection iT = new Intersection();
        int [] actualResult = iT.IntersectionAlgorithm(array1, array2 );

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
