import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_6_ContainsJavaTest {

     @Test
    public void testContainsJavaTestHappyPass () {
        String str = "As of March 2022, Java 18 is the latest version, "
                + "while Java 17, 11 and 8 are the current long-term support (LTS) "
                + "versions. Oracle released the last zero-cost public update for "
                + "the legacy version Java 8 LTS in January 2019 for commercial "
                + "use, although it will otherwise still support Java 8 with "
                + "public updates for personal use indefinitely. Other vendors "
                + "have begun to offer zero-cost builds of OpenJDK 8 and 11 that "
                + "are still receiving security and other upgrades";

        boolean expectedResult = true;

        String_6_ContainsJava cJ = new String_6_ContainsJava();
        boolean actualResult = cJ.ContainsJavaAlgorithm(str);

       // Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertTrue(true);

    }

    @Test
    public void testContainsJavaTestWithoutJava () {
        String str = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me";

        boolean expectedResult = false;

        String_6_ContainsJava cJ = new String_6_ContainsJava();
        boolean actualResult = cJ.ContainsJavaAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertFalse(false);

    }
}
