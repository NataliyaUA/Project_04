import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_3_RemoveAllZerosTest {
    @Test
    public void testRemoveAllZerosTestHappyPass() {
        String str = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        String expectedResult = "35429764";

        String_3_RemoveAllZeros rAZ = new String_3_RemoveAllZeros();
        String actualResult = rAZ.RemoveAllZerosAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveAllZerosTestHappyPass1() {
        String str = " 0000000111";
        String expectedResult = "111";

        String_3_RemoveAllZeros rAZ = new String_3_RemoveAllZeros();
        String actualResult = rAZ.RemoveAllZerosAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testRemoveAllZerosTestIsEmpty() {
        String str = "";
        String expectedResult = null;

        String_3_RemoveAllZeros rAZ = new String_3_RemoveAllZeros();
        String actualResult = rAZ.RemoveAllZerosAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveAllZerosTestGapIndex() {
        String str = " ";
        String expectedResult = "";

        String_3_RemoveAllZeros rAZ = new String_3_RemoveAllZeros();
        String actualResult = rAZ.RemoveAllZerosAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
