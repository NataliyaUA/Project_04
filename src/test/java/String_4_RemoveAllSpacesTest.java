import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_4_RemoveAllSpacesTest {
    @Test
    public void testRemoveAllSpacesTestHappyPass() {
        String str = "    QA   4  Everyone   ";
        String expectedResult = "QA4Everyone";

        String_4_RemoveAllSpaces rAs = new String_4_RemoveAllSpaces();
        String actualResult = rAs.RemoveAllSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testRemoveAllSpacesTest2() {
        String str = "p a     n d a   ";
        String expectedResult = "panda";

        String_4_RemoveAllSpaces rAs = new String_4_RemoveAllSpaces();
        String actualResult = rAs.RemoveAllSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
