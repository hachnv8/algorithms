package leetcode;

/**
 * Created by HachNV on 11/05/2023
 */
public class p14 {
    public static void main(String[] args) {
        String[] strs = new String[] {"leetcode", "leet", "leetco"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
