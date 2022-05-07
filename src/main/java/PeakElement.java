public class PeakElement {
    public int [] PeakElementAlgorithm(int[] array) {
        if (array.length != 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == 0 && array[i] > array[i + 1]) {
                    count++;
                    i++;
                } else if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    count++;
                   // i++;
                } else if (i == array.length - 1 && array[array.length - 1]
                        > array[array.length - 2]) {
                    count++;
                    i++;

                } else {
                    i++;
                }
            }
            int num = 0;
            int[] result = new int[count];
            for (int i = 0; i < array.length;i++) {
                if (i == 0 && array[i] > array[i + 1]) {
                    result[num] = array[i];
                    num++;
                    i++;
                } else if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    result[num] = array[i];
                    num++;
                  //  i++;
                } else if (i == array.length - 1 && array[array.length - 1]
                        > array[array.length - 2]) {
                    result[num] = array[array.length - 1];
                    num++;
                    i++;
                } else {
                    i++;
                }
            }
            return result;
        }
        return new int[]{};
    }
}
