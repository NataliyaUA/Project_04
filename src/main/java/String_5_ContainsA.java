public class String_5_ContainsA {
public int ContainsAAlgorithm (String str) {
    int sum = 0;
    char charA = 'a';
    if(str.length() !=0) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == charA) {
                sum++;

            }
        }
        return sum;

    }
    return 0;
}


}
//Напишите метод, который принимает на вход строку и считает, сколько букв а
// или А содержится в строке.
//Test Data:
//“Abracadabra” → 5
//“Homenum Revelio” → 0