package hackerrank.dsa;

import java.util.List;

/**
 * Created by HachNV on 30/05/2023
 */
public class DiagonalDifference {
    public static void main(String[] args) {

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        int j = arr.size()-1;
        for (List<Integer> integers : arr) {
            sum1 += integers.get(i);
            sum2 += integers.get(j);
            i++;
            j--;
        }
        return Math.abs(sum1 - sum2);
    }
}
