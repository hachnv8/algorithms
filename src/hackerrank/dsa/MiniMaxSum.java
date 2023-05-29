package hackerrank.dsa;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HachNV on 26/05/2023
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(256741038 , 623958417 , 467905213 , 714532089 , 938071625);
        miniMaxSum(list);
    }

    public static void miniMaxSum(List<Integer> arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long total = 0;
        for (Integer integer : arr) {
            total += integer;
            if (min > integer) min = integer;
            if (max < integer) max = integer;
        }
        System.out.print(total-max);
        System.out.print(" ");
        System.out.println(total-min);
    }
}
