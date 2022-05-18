import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_17_CountWordsTest {
    @Test
    public void testCountWordsTestHappyPassJava () {
        String str = "As of March 2022, Java 18 is the latest version, while " +
                "Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial java use, " +
                "although it will otherwise still support Java 8 with public " +
                "updates for personal use indefinitely. Other vendors have begun" +
                " to offer zero-cost builds of OpenJDK 8 and 11 that are still " +
                "receiving security and other upgrades.";
        String str1 = "java";
        int expectedResult = 5;

        String_17_CountWords cW = new String_17_CountWords();
        int actualResult = cW.CountWordsAlgorithm(str, str1);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountWordsTestHappyPassWordVersion () {
        String str = "As of March 2022, Java 18 is the latest version, while " +
                "Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial java use, " +
                "although it will otherwise still support Java 8 with public " +
                "updates for personal use indefinitely. Other vendors have begun" +
                " to offer zero-cost builds of OpenJDK 8 and 11 that are still " +
                "receiving security and other upgrades.";
        String str1 = "version";
        int expectedResult = 2;

        String_17_CountWords cW = new String_17_CountWords();
        int actualResult = cW.CountWordsAlgorithm(str, str1);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}
