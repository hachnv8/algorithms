package leetcode;

/**
 * Created by HachNV on 19/05/2023
 */
public class p1768 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        while (p1 < word1.length() || p2 < word2.length()) {
            if(p1 < word1.length()) {
                sb.append(word1.charAt(p1));
                p1++;
            }
            if(p2 < word2.length()) {
                sb.append(word2.charAt(p2));
                p2++;
            }
        }
        return String.valueOf(sb);
    }
}
