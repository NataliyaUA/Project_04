public class String_18_StartsWithLetter {

    public String StartsWithLetterAlgorithm(String str1, String str2) {
        String result = "";
        String space = ", ";
        if (str1 != null && str1.length() > 0) {
            str1 = str1.replaceAll(",", "")
                    .replace(".", "")
                    .replace("\n", " ");
            String [] newStr  = str1.split(" ");
            for (int i = 0; i < newStr.length; i++) {
                if (newStr[i].startsWith(str2)) {
                    result += newStr[i].concat(space);
                } else if (newStr[i].startsWith(str2.toUpperCase())) {
                    result += newStr[i];
                }

            }

            return result;
        }

        return null;
    }

}
//Написать алгоритм StartsWithLetter, который принимает на вход текст,
// и возвращает в виде строки все слова, которые начинаются с буквы l.