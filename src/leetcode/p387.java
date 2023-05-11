package leetcode;

/**
 * Created by HachNV on 05/05/2023
 */
public class p387 {
    public static void main(String[] args) {
        String s = "leetcode";
        int a = firstUniqChar(s);
        System.out.println(a);
    }
    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        int num = -1;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 'a'] == 1) {
                num = i;
                break;
            }
        }

        return num;
    }

}
