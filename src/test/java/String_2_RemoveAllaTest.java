import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class String_2_RemoveAllaTest {
    @Test
    public void testRemoveAllaTestHappyPass() {
        String str = "panda";
        String expectedResult = "pnd";

        String_2_RemoveAlla rA = new String_2_RemoveAlla();
        String actualResult = rA.RemoveAllaAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testRemoveAllaTestNoA() {
        String str = "    QA4Everyone   ";
        String expectedResult = "QA4Everyone";

        String_2_RemoveAlla rA = new String_2_RemoveAlla();
        String actualResult = rA.RemoveAllaAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testRemoveAllaIsEmpty() {
        String str = "";
        String expectedResult = "";

        String_2_RemoveAlla rA = new String_2_RemoveAlla();
        String actualResult = rA.RemoveAllaAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}

