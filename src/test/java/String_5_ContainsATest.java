import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_5_ContainsATest {
    @Test
    public void testContainsATestHappyPass() {
        String str = "Abracadabra";
        int expectedResult = 5;

        String_5_ContainsA cA = new String_5_ContainsA();
        int actualResult = cA.ContainsAAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testContainsATestNoAs() {
        String str = "Homenum Revelio";
        int expectedResult = 0;

        String_5_ContainsA cA = new String_5_ContainsA();
        int actualResult = cA.ContainsAAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testContainsTestUpperCaseA() {
        String str = "AAAAAAAAAAA";
        int expectedResult = 11;

        String_5_ContainsA cA = new String_5_ContainsA();
        int actualResult = cA.ContainsAAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
