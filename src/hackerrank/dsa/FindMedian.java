package hackerrank.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by HachNV on 26/05/2023
 */
public class FindMedian {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3, 4, 2, 6);
        findMedian(arr);
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        arr = arr.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        return 1;
    }
}
