public class String_16_StringToNumbers {
    public String StringToNumbersAlgorithm (String str) {
        String str1 = "";
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    str1 += str.charAt(i);
                }

            }
            return str1;


        }
        return null;
    }

}
