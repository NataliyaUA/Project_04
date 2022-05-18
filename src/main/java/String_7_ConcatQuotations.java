public class String_7_ConcatQuotations {

    public String ConcatQuotationsAlgorithm (String str) {
        String str1 = "“";
        String str2 = ".”";
        if (str.length() > 0) {
            str = str.trim();
            str = str1.concat(str).concat(str2);
            return str;
        }
        return null;
    }
}

//Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале
// строки, точку и кавычки в конце строки с помощью метода concat()
//Test Data:
//“One” → ““One.””
//“    TWO  “ → ““TWO.””