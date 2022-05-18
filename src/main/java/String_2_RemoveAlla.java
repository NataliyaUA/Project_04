public class String_2_RemoveAlla {
    public String RemoveAllaAlgorithm(String str) {
        String str1;
        if (str!= null && str.length() >0) {
            str = str.trim();
            if (str.contains("a")) {
                str1 = str.replace("a", "");
                return str1;
            }else {

            }return str;

        }
        return "";
    }

}
//Написать алгоритм RemoveAlla.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
// Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
// Метод возвращает обработанную строку.
//Test Data:
// “    QA4Everyone   “ →  “QA4Everyone“
//“panda   “ → “pnd”

