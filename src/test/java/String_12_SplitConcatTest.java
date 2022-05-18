import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_12_SplitConcatTest {
    @Test
    public void testString_12_SplitConcatTestHappyPass() {
        String str = "Александр Сергеевич Пушкин";
        String [] expectedResult = {"Имя: Александр", "Отчество: Сергеевич", "Фамилия: Пушкин"};

        String_12_SplitConcat sC = new String_12_SplitConcat();
        String [] actualResult = sC.SplitConcatAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
