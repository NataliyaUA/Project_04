import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    @Test
    public void testOddIndicesTestHappyPassOddNumber() {

        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oI = new OddIndices();
        int[] actualResult = oI.OddIndicesAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
   @Test
   public void testOddIndicesTestZeroIndices() {

            int[] arr = {-45};
            int[] expectedResult = {};

            OddIndices oI = new OddIndices();
            int[] actualResult = oI.OddIndicesAlgorithm(arr);

            Assertions.assertArrayEquals(expectedResult, actualResult);

        }










    }



