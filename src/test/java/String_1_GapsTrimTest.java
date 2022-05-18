import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_1_GapsTrimTest {
      @Test
    public void testGapsTrimTestHappyPass() {

        String str = "    QA4Everyone   ";
        String expectedResult = "Лишние пробелы удалены";

        String_1_GapsTrim gT = new String_1_GapsTrim();
        String actualResult = gT.GapsTrimAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testGapsTrimTestNoGaps() {

        String str = "QA4Everyone";
        String expectedResult = "Пробелов не было";

        String_1_GapsTrim gT = new String_1_GapsTrim();
        String actualResult = gT.GapsTrimAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGapsTrimStringIsEmpty() {

        String str = "";
        String expectedResult = "Строка пустая";

        String_1_GapsTrim gT = new String_1_GapsTrim();
        String actualResult = gT.GapsTrimAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }



}
