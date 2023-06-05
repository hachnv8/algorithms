package hackerrank.dsa;

/**
 * Created by HachNV on 30/05/2023
 */
public class JavaSubstrComparisons {
    public static void main(String[] args) {
        String s = "welcomeToJava";
        int k = 3;
        String res = getSmallestAndLargest(s, k);
        System.out.println(res);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length()-k; i++) {
            String string = s.substring(i, i+k);
            smallest = smallest.equals("")
                    ? string :
                    string.compareTo(smallest) < 0 ? string : smallest;
            largest = largest.equals("")
                    ? string :
                    string.compareTo(largest) > 0 ? string : largest;
        }

        return smallest + "\n" + largest;
    }
}
