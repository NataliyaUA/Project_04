import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_18_StartsWithLetterTest {
    @Test
    public void testStartsWithLetterLTestHappyPass() {

        String str1 ="As a decrepit father takes delight\n" +
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
                "This wish I have; then ten times happy me.";

        String str2 = "l";
        String expectedResult = "lame, love, lame, live, Look";

        String_18_StartsWithLetter lT = new String_18_StartsWithLetter();
        String actualResult = lT.StartsWithLetterAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testStartsWithLetterLNoWordsStartWithL() {

        String str1 ="As a decrepit father takes delight\n" +
        "To see his active child do deeds of youth,\n" +
                "So I, made by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my engrafted to this store.\n" +
                "So then I am not, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory .\n" +
                " what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me";
        ;

        String str2 = "l";
        String expectedResult = "";

        String_18_StartsWithLetter lT = new String_18_StartsWithLetter();
        String actualResult = lT.StartsWithLetterAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
