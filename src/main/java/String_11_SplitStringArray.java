public class String_11_SplitStringArray {
    public String [] SplitStringArrayAlgorithm (String str) {
        if (str.length() > 0) {
            String [] regex = str.split(" ");
            for (int i =0; i < regex.length; i++) {

                return regex;

            }
        }
        return new String [] {};
}


//Напишите метод, который принимает на вход предложение и возвращает слова
// из этого предложения в виде массива слов
//Test Data:
//“QA for Everyone” → {“QA”, “for”, “Everyone”}
//“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
}
