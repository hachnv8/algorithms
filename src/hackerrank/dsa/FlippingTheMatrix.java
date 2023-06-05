package hackerrank.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HachNV on 30/05/2023
 */
public class FlippingTheMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(112, 42, 83, 119));
        matrix.add(Arrays.asList(56, 125, 56, 49));
        matrix.add(Arrays.asList(15, 78, 101, 43));
        matrix.add(Arrays.asList(62, 98, 114, 108));
        System.out.println(flippingMatrix(matrix));
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int i = 0;
        int j = matrix.size()-1;
        while(i < matrix.size()/2){
            if(j >= matrix.size()/2) {
                int k = matrix.size()-j-1;
                int l = matrix.size()-i-1;
                int max = findMax(matrix.get(i).get(k), matrix.get(i).get(j), matrix.get(l).get(j), matrix.get(l).get(k));
                sum += max;
                j--;
            } else {
                i++;
                j = matrix.size()-1;
            }
        }
        return sum;
    }

    public static int findMax(int a, int b, int c, int d) {
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }
}
