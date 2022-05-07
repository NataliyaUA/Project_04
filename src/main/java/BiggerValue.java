public class BiggerValue {
    public int BiggerValueAlgorithm (int a, int b) {
        int max = 0;
        if (a != b) {
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
            return max;
        }
        return 0;
    }
}



//Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает
// бОльшее значение.
//Test Data:
//3333, 9999
//Expected Result = 9999