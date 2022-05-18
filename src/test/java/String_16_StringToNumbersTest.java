import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_16_StringToNumbersTest {
    @Test
    public void testStringToNumbersTest () {
        String str = "h b s#d]yssd%s53@89df u//*9 903 [=45587+ /.,/ o";
        String expectedResult = "5389990345587";

        String_16_StringToNumbers sN = new String_16_StringToNumbers();
        String actualResult = sN.StringToNumbersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
