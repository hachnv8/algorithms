package hackerrank.dsa;

/**
 * Created by HachNV on 30/05/2023
 */
public class IsAnagram {
    public static void main(String[] args) {
        boolean isOK = isAnagram("hello", "HELLO");
        System.out.println(isOK);
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] countA = new int[26];
        int[] countB = new int[26];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) - 'a' < 0) {
                countA[a.charAt(i) + 32 - 'a']++;
            } else {
                countA[a.charAt(i) - 'a']++;
            }
            if (b.charAt(i) - 'a' < 0) {
                countB[b.charAt(i) + 32 - 'a']++;
            } else {
                countB[b.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < countA.length; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }
        return true;
    }
}
