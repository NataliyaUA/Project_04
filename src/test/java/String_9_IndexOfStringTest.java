import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_9_IndexOfStringTest {
    @Test
    public void testIndexOfStringTestLetterB ()  {
        String str = "Abracadabra";
        String str1 = "b";
        String expectedResult = "bracadab";

        String_9_IndexOfString iOt = new String_9_IndexOfString();
        String actualResult = iOt.IndexOfStringAlgorithm(str, str1);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testIndexOfStringTestLetterP ()  {
        String str = "Whippersnapper";
        String str1 = "p";
        String expectedResult = "ppersnapp";

        String_9_IndexOfString iOt = new String_9_IndexOfString();
        String actualResult = iOt.IndexOfStringAlgorithm(str, str1);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
