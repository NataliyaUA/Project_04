import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_16_StringToLettersTest {
    @Test
    public void testStringToLettersTestHappyPass() {
        String str = "h b s#d]yssd%s53@89df u//*9 903 [=45587+ /.,/ o";
        String expectedResult = "hbsdyssdsdfuo";

        String_16_StringToLetters sT = new String_16_StringToLetters();
        String actualResult = sT.StringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }



}
