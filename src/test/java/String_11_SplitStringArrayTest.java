import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_11_SplitStringArrayTest {
    @Test
    public void testSplitStringArrayTestHappyPass () {
        String str = "QA for Everyone";
        String [] expectedResult = {"QA", "for", "Everyone"};

        String_11_SplitStringArray sS = new String_11_SplitStringArray();
        String [] actualResult = sS.SplitStringArrayAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSplitStringArrayTestHappyPass1 () {
        String str = "Александр Сергеевич Пушкин";
        String [] expectedResult = {"Александр", "Сергеевич", "Пушкин"};

        String_11_SplitStringArray sS = new String_11_SplitStringArray();
        String [] actualResult = sS.SplitStringArrayAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
