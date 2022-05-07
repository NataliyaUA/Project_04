public class GoodNumber {
    public String GoodNumberAlgorithm (int M) {
        String goodNumber = "Good Number";
        String badNumber = "Bad Number";
        String poorNumber = "Poor Number";
        if (M % 3 == 0 && M % 5 == 0) {

            return goodNumber;
        }else if (M % 3 == 0 && M % 5 !=0){

            return badNumber;
        }else if (M % 3 != 0 && M % 5 ==0){

            return poorNumber;
        }else {

        }
        return "false";
    }

}


//Given an integer M perform the following conditional actions:
//If M is multiple of 3 and 5 then return "Good Number".
//If M is only multiple of 3 and not of 5 then return "Bad Number"
//If M is only multiple of 5 and not of 3 then return "Poor Number"
//If M doesn't satisfy any of the above conditions then return "-1"