public class String_2_RemoveAlla {

    public String RemoveAllaAlgorithm(String str) {
       if (str.length()!= 0) {
           str = str.trim();
           for (int i = 0; i< str.length(); i++){
               if (str.charAt(i) == 'a') {
                   str1 = str.replace("a", "");

                   return str;
               }else {

                   return
               }
           }

       }

    }

}
//Написать алгоритм RemoveAlla.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
// Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
// Метод возвращает обработанную строку.
//Test Data:
// “    QA4Everyone   “ →  “QA4Everyone“
//“panda   “ → “pnd”