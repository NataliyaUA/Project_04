public class String_4_RemoveAllSpaces {
   public String RemoveAllSpacesAlgorithm (String str) {
       if (str!= null && str.length() >0) {
           str = str.replace(" ", "");

           return str;
       }
       return "";
   }

}


//Написать алгоритм RemoveAllSpaces.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход
// строку. Если строка валидная, то метод удаляет все пробелы из строки, если
// таковые имеются. Метод возвращает обработанную строку.
//Test Data:
// “    QA   4  Everyone   “ →  “QA4Everyone“
//“p a     n d a   “ → “panda”