package hackerrank.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HachNV on 30/05/2023
 */
public class BetweenTwoSet {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        int x = getTotalX(a,b);
        System.out.println(x);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int res = 0;
        int lcm = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer integer : a) {
            if (integer > lcm) lcm = integer;
        }
        int count = 0;
        for (int i = lcm; i <= b.get(0); i++) {
            for (Integer integer : a) {
                if (i % integer == 0) count++;
            }
            if(count == a.size()) {
                list.add(i);
            }
            count=0;
        }

        int count2 = 0;
        for (Integer integer : list) {
            for (Integer value : b) {
                if (value % integer == 0) count2++;
            }

            if (count2 == b.size()) {
                res++;
            }

            count2 = 0;
        }
        return res;
    }
}
