public class String_17_CountWords {
    public int CountWordsAlgorithm (String str, String str1) {
        int count = 0;
        int total = 0;
        str = str.replaceAll(",", "");
        str= str.toLowerCase();
        str1 = str1.toLowerCase();

        if (str.length() > 0) {
            String[] space = str.split(" ");
            for (int i = 0; i < space.length; i++) {
                if (space[i].equals(str1)) {
                    count++;

                }

            }
            return count;
        }
        return 0;
    }


//Напишите алгоритм CountWords,
// который принимает на вход текст и слово,  и считает все вариации этого слова в тексте















}

