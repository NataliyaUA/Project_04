import org.junit.jupiter.api.*;
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AscendingSequenceTest {
        AscendingSequence aS;
    @BeforeEach      //чтобы выполнялось какое-то условие перед каждом тесте
    void setup() {aS = new AscendingSequence();
    }
    @Order(1)
    @Test
    public void testAscendingSequenceHappyPathPositiveNumbers() {

        //Arrange
        //0,1,2,3,4,5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        //Act
        AscendingSequence aS = new AscendingSequence(); //создание объекта
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        //Assert(спец.методы которые встроенные в фреймворк и выдают значения
        // Pass/Fail
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Order(6)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumbers() {

       //Arrange

       int start = -10;
       int end = -7;
       int step = 1;
       int[] expectedResult = {-10, -9, -8, -7,};

       //Act
       AscendingSequence aS = new AscendingSequence(); //создание объекта
       int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

       //Assert(спец.методы которые встроенные в фреймворк и выдают значения
       // Pass/Fail
       Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(7)
     @Test
    public void testAscendingSequenceHappyPathNegativeNumbersPositive() {

        //Arrange

        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        //Act
        AscendingSequence aS = new AscendingSequence(); //создание объекта
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        //Assert(спец.методы которые встроенные в фреймворк и выдают значения
        // Pass/Fail
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {

        //Arrange

        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        //Act
        AscendingSequence aS = new AscendingSequence(); //создание объекта
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
     }
    @Order(3)
      @Test
      public void testAscendingSequenceStartLargeThanEnd() {

        //Arrange

        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        //Act
        AscendingSequence aS = new AscendingSequence(); //создание объекта
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void testAscendingSequenceNegativeStep() {

        //Arrange

        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        //Act
        AscendingSequence aS = new AscendingSequence(); //создание объекта
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void testAscendingSequenceStepZero() {

        //Arrange

        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};

        //Act
        AscendingSequence aS = new AscendingSequence(); //создание объекта
        int[] actualResult = aS.ascendingSequenceAlgorithm(start, end, step);

        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
