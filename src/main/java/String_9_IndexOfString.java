public class String_9_IndexOfString {
    public String IndexOfStringAlgorithm (String str, String str1) {
        if(str.length() > 0) {
            str = str.substring(str.indexOf(str1), str.lastIndexOf(str1)+1);
            return str;
        }

        return "No words found";
    }

}

//Напишите метод, который принимает на вход строку, и возвращает все, что
// находится между первой и последней буквой-параметром:
//Test Data:
//“Abracadabra”, “b” → “bracadab”
//“Whippersnapper”, “p” → “ppersnapp”