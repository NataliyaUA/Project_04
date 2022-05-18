public class String_12_SumOfStringValues {
    public int SumOfStringValuesAlgorithm(String str) {
        if (str.length() > 0) {
            int sum = 0;
            char str1;

            for (int i = 0; i < 3; i++) {
                str1 = str.charAt(i);
                if (Character.isDigit(str1)) {
                    return 0;
                } else
                    sum += (int) str.charAt(i);
            }
            return sum;
        }

        return 0;
    }

}
//Написать метод, который возвращает сумму всех букв слова
//
//“abc” → 294
//“ABC” → 198
//“123” → 0 (это не буквы)