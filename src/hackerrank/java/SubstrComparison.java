package hackerrank.java;

/**
 * Created by HachNV on 25/05/2023
 */
public class SubstrComparison {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        String[] a = new String[s.length()-k];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.substring(i, i+3);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
