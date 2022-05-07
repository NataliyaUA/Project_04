public class OddIndices {
    public int[] OddIndicesAlgorithm(int[] array) {
        if (array.length != 0) {
            int oddIndices = 0;
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    oddIndices++;
                }
            }
                int[] OddArray = new int[oddIndices];  // int[] OddArray = new int[oddIndices/2];  //

            for (int i = 0; i < array.length; i++) {
                    if (i % 2 != 0) {
                        OddArray[j] = array[i];
                        j++;
                    }
                }

                return OddArray;
            }


        return new int[]{};
    }

}




//Написать алгоритм OddIndices, который принимает массив чисел,
// и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}