public class Intersection {
    public int [] IntersectionAlgorithm (int [] array1, int [] array2) {
        if (array1.length != 0 && array2.length != 0) {
            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array2[j] == array1[i]) {
                        count++;
                    }
                }
            }
            int num = 0;
            int[] array = new int[count];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length;j++) {
                    if (array1[i] == array2[j]) {
                        array[num] = array1[i];
                        num++;
                    }
                }
            }
            return array;
        }
        return new int[]{};
    }

}
//Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
// и возвращает массив общих элементов.
//Test Data:
//{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//{1, 2, 4, 5, 89}, {8, 9, 45} → {}