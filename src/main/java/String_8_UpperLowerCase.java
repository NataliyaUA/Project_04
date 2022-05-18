public class String_8_UpperLowerCase {
    public String UpperLowerCaseAlgorithm(String str) {
        if (!str.isEmpty()) {
            str = str.trim();
            str = str.toUpperCase()
                    .substring(0,1)
                    .concat(str.substring(1)
                    .toLowerCase());

            return str;
        }
        return null;
    }
}


////Напишите метод, кторый принимает на вход название города и исправляет написание:
////Test Data:
////“ташкент” → “Ташкент”
////“ЧикаГО” → “Чикаго”