public class String_6_ContainsJava {

    public boolean ContainsJavaAlgorithm (String str) {
        if (!str.isEmpty()) {
            if (str.contains("Java")) {

                return true;
            } else {

                return false;
            }
        }
        return true;
    }


}
 //Напишите метод, который принимает на вход текст и проверяет,
// содержится ли в тексте хотя бы одно слово Java.