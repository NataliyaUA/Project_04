public class String_14_CompareTwoLetters {
    public boolean CompareTwoLettersAlgorithm(String a, String b) {
        String str = a.concat(b);
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(0) < str.charAt(1)) {

                    return true;
                } else {

                    return false;
                }
            }

        }
        return false;
    }

}

//Написать метод,  который принимает на вход 2 буквы и возвращает true,
// если первая буква встречается раньше второй, иначе метод возвращает false
//method(“a”, “m”) → true
//method(“m”, “l”) → false