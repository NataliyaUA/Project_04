import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_16_StringToNumbersAndSpacesTest {
    @Test
    public void testStringToNumbersAndSpacesTestHappyPass () {
        String str = "h b s#d]yssd%s53@89df u//*9 903 [=45587+ /.,/ o";
        String expectedResult = "  5389 9 903 45587  ";

    String_16_StringToNumbersAndSpaces sS = new String_16_StringToNumbersAndSpaces();
    String actualResult = sS.StringToNumbersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
