public class OddEven {
    public String OddEvenAlgorithm(int a) {
        String Even = "Even";
        String Odd = "Odd";
        int b = 2147483647 + 1;
        String Undefined = "Undefined";
        if(a >=Integer.MAX_VALUE && a<= Integer.MIN_VALUE){
        if (a < Integer.MAX_VALUE) {
            if (a % 2 == 0) {

                return Even;
            } else if (a % 2 != 0) {

                return Odd;
            }
            //if (a < Integer.MIN_VALUE) {
        }

            }
        return Undefined;

    }
//        return "  ";
//
//
//    }
    }
//Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
// если число нечетное, и “Even”, если число четное. Во всех остальных случаях
//результат будет “Undefined”.
//Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”