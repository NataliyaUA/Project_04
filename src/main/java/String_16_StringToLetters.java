public class String_16_StringToLetters {
    public String StringToLettersAlgorithm (String str) {
        String str1 = "";
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    str1 += str.charAt(i);
                }

            }
            return str1;


        }
        return null;
    }


}
