import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    @Test
    public void testIsPositiveNumberPositiveValue() {
        int a  = 555;
        boolean expectedResult = true;

        IsPositiveNumber iPn = new IsPositiveNumber();
        boolean actualResult = iPn.IsPositiveNumberAlgorithm(a);

        //Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertTrue(expectedResult);

    }
    @Test
    public void testIsPositiveNumberNegativeValue() {
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber iPn = new IsPositiveNumber();
        boolean actualResult = iPn.IsPositiveNumberAlgorithm(a);
    }
    @Test
    public void testIsPositiveNumberZeroValue() {
        int a = 0;
        boolean expectedResult = false;

        IsPositiveNumber iPn = new IsPositiveNumber();
        boolean actualResult = iPn.IsPositiveNumberAlgorithm(a);

        Assertions.assertFalse(expectedResult);
    }


}
