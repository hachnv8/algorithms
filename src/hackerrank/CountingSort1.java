package hackerrank;

import java.util.*;

/**
 * Created by HachNV on 30/05/2023
 */
public class CountingSort1 {
    public static void main(String[] args) {
            List<Integer> arr = Arrays.asList(1, 3, 4, 6, 2, 7, 7, 9);
        List<Integer> sort = countingSort(arr);
        for (Integer integer : sort) {
            System.out.println(integer);
        }
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        int max = -1;
        for (Integer integer : arr) {
            if (integer > max) max = integer;
        }
        // Write your code here
        List<Integer> count = new ArrayList<>(Collections.nCopies(max+1, 0));
        for (int value : arr) {
            int t = count.get(value)+1;
            count.set(value, t);
        }
        return count;
    }
}
