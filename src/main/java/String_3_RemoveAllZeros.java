public class String_3_RemoveAllZeros {
    public String RemoveAllZerosAlgorithm (String str) {
        if (str!= null && str.length() >0) {
            str = str.replace(" ", "");
            str = str.replace("0", "");

            return str;
        }


        return "is empty";
    }


}

//Написать алгоритм RemoveAllZeros.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход
// строку, состоящую из цифр. Если строка валидная, то метод удаляет все пробелы
// из строки, если таковые имеются. Метод возвращает обработанную строку,
// в которой нет нулей.
//Test Data:
// “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//“ 0000000111“ → “111”