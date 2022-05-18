import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_16_StringToLettersAndSpacesTest {
    @Test
    public void testStringToLettersAndSpacesTestHappyPass() {
        String str = "h b s#d]yssd%s53@89df u//*9 903 [=45587+ /.,/ o";
        String expectedResult = "h b sdyssdsdf u    o";

        String_16_StringToLettersAndSpaces sSt = new String_16_StringToLettersAndSpaces();
        String actualResult = sSt.StringToLettersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
