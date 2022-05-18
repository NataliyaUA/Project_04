public class String_16_StringToNumbersAndSpaces {
    public String StringToNumbersAndSpacesAlgorithm (String str) {
        String str1 = "";
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)) || Character.isSpaceChar(str.charAt(i))) {
                    str1 += str.charAt(i);
                }

            }
            return str1;


        }
        return null;


    }
}
