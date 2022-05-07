import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodNumberTest {
    @Test
    public void testGoodNumberTestHappyPassGoodNumber() {
        int M = 15;
        String expectedResult = "Good Number";

        GoodNumber gN = new GoodNumber();
        String actualResult = gN.GoodNumberAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGoodNumberTestHappyPassBadNumber() {
        int M = 27;
        String expectedResult = "Bad Number";

        GoodNumber gN = new GoodNumber();
        String actualResult = gN.GoodNumberAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGoodNumberTestHappyPassPoorNumber() {
        int M = 100;
        String expectedResult = "Poor Number";

        GoodNumber gN = new GoodNumber();
        String actualResult = gN.GoodNumberAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGoodNumberTestFailedResult() {
        int M = 22;
        String expectedResult = "false";

        GoodNumber gN = new GoodNumber();
        String actualResult = gN.GoodNumberAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
