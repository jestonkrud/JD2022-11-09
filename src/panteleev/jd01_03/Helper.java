package panteleev.jd01_03;

import java.util.Arrays;

public class Helper {
    static double findMin(double[ ] array){
        double min = array[0];
        for (double value : array) {
            if (min>value){
                min = value;
            }
        }
        return min;
    }
    static double findMax(double[ ] array){
        double max = array[0];
        for (double value : array) {
            if (max < value){
                max = value;
            }
        }
        return max;
    }
    static double[] sort(double[ ] array) {
        Arrays.sort(array);
        return array;
    }
}
