public class AscendingSequence {
    //0, 1, 2, 3, 4, 5

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {
        if(step > 0 && start < end) {
           int [] result = new int[(end - start + 1)/step];


//           int j =0;
//           for(int i = start; i < result.length; i+=step) {//1 way
//               if (j<= result.length) {
//                   result[j] = i;
//                   j++;
//               }
//
//           }
//            return result

            for(int i = 0; i < result.length; i++) { //  2 way
                if(start<=end){
                    result[i] = start;
                    start+=step;
                }
            }
            return result;

        }

        return new int[] {};
    }








}
