public class SumArray {
    public int SumArrayAlgorithm(int [] array) {
        if (array.length != 0) {
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
        return 0;
    }






}





//Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//
//Test Data:
//{0, 1, 2, 3, 4, 5} → 15
//{-7, -3} → -10