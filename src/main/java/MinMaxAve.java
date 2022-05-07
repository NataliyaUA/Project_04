public class MinMaxAve {

    public int[] MinMaxAveAlgorithm (int [] array, int n1, int n2) {
        int[] result = new int[array.length];
        int min = Integer.MAX_VALUE;
        if (array.length > 0 && n2 > n1) {
            for (int i = n1; i <= n2; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = n1; i <= n2; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            int average = 0;
            int count = 0;
            int sum = 0;
            for (int i = n1; i <= n2; i++) {
                sum += array[i];
                count++;
                average = sum / count;
            }
            result = new int[]{min, max, average};
            return result;
        }
        return new int[] {};
    }


}


//Написать алгоритм MinMaxAve, который принимает массив чисел int[]
// и 2 значения индексов. Алгоритм возвращает массив, который содержит
// минимальное значение, максимальное значение,  и среднее среди всех значений
// между 2-мя индексами.
//Test Data:
//({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}