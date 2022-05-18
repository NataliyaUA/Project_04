public class String_12_SplitConcat {
    public String[] SplitConcatAlgorithm(String str) {
        String name = "Имя: ";
        String middleName = "Отчество: ";
        String lastName = "Фамилия: ";
        String[] regex = str.split(" ");
        if (str.length() > 0) {
            for (int i = 0; i < regex.length; i++) {
                regex[0] = name.concat(regex[0]);
                regex[1] = middleName.concat(regex[1]);
                regex[2] = lastName.concat(regex[2]);

                return regex;
            }
        }
        return new String[]{};
    }
}
//Написать метод, который принимает на вход предложение, которое состоит из
// имени, фамилии, отчества и возвращает массив строк:
//Test Data:
//“Александр Сергеевич Пушкин” →
//{“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}