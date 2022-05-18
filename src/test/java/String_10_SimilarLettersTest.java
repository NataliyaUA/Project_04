import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_10_SimilarLettersTest {
    @Test
    public void testSimilarLettersTestHappyPassFind() {
        String str = "Abracadabra";
        boolean expectedResult = true;

        String_10_SimilarLetters sL = new String_10_SimilarLetters();
        boolean actualResult = sL.SimilarLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testSimilarLettersTestDoNotFind() {
        String str = "Whippersnapper";
        boolean expectedResult = false;

        String_10_SimilarLetters sL = new String_10_SimilarLetters();
        boolean actualResult = sL.SimilarLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);


    }
    @Test
    public void testSimilarLettersZeroString() {
        String str = "";
        boolean expectedResult = false;

        String_10_SimilarLetters sL = new String_10_SimilarLetters();
        boolean actualResult = sL.SimilarLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);


    }
}
