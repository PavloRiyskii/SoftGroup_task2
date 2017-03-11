/**
 * Created by pavlo on 11.03.17.
 */
public class Complementary {
    /**
    * @param array the array of integer
    * @param k 
    * @return true if there are komplimentary pair
    */
    public static boolean isComplementary (int[] array, int K) {
        int leftBound = 0, rightBound = array.length - 1;
        while(true) {
            if (leftBound == rightBound) {
                System.out.println("There is no complementary pair");
                return false;
            }
            if ((array[leftBound] + array[rightBound]) < K) leftBound++;
            else if ((array[leftBound] + array[rightBound])> K) rightBound--;
            else break;
        }
        System.out.println(K + " = " + array[leftBound] + " + " + array[rightBound] + "");
        return true;
    }
}
