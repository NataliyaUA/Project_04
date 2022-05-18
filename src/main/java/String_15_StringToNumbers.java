import java.util.Arrays;

public class String_15_StringToNumbers {
    public int [] StringToNumbersAlgorithm (String str) {
        if (!str.isEmpty()) {
            str = str.replaceAll(",", "");
            String[] str1 = str.split(" ");
            int[] arrayOfNumbers = new int[str1.length];
            for (int i = 0; i < str1.length; i++) {
                arrayOfNumbers[i] = Integer.parseInt(str1[i]);

            }
            return arrayOfNumbers;
        }
        return new int[]{};
    }

}
//Написать алгоритм StringToNumbers, который принимает строку,
// и возвращает массив чисел:
//Test Data:
//“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
//(Без форматирования)