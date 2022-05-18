public class String_10_SimilarLetters {

    public boolean SimilarLettersAlgorithm(String str) {
        String str1;
        String str2;
        int lastIndex;
        if (!str.isEmpty()) {
            str = str.toLowerCase();
            str1 = str.substring(0, 1);
            lastIndex = str.lastIndexOf(str1);
            str2 = str.substring(lastIndex);
            if (str1.equals(str2)) {

                return true;
            } else {

                return false;
            }
        }

        return false;
    }
}

//Напишите метод, который принимает на вход слово, и возвращает true,
// если слово начинается и заканчивается на одинаковую букву, и false иначе
//Test Data:
//	“Abracadabra” → true
//	“Whippersnapper” → false