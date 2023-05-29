package hackerrank.dsa;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HachNV on 26/05/2023
 */
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) positive++;
            if (integer < 0) negative++;
            if (integer == 0) zero++;
        }

        System.out.printf("%.6f%n", positive/n);
        System.out.printf("%.6f%n", negative/n);
        System.out.printf("%.6f%n", zero/n);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = Arrays.asList(1, 1, 0, -1, -1);
        Result.plusMinus(arr);
    }
}
