package leetcode;
/*
  Created by HachNV on 05/05/2023
  Question:
  Given a string s, find the length of the longest substring without repeating characters.
 */

/* Question:
  Given a string s, find the length of the longest substring without repeating characters.
 */

/** Answer:
 *  Đầu tiên ta tạo Map chars dùng để lưu trữ số lần xuất hiện của ký tự trong String s
 *  Tiếp theo tạo 2 biến left và right dùng để tính khoảng cách giữa 2 char giống nhau gần nhất
 *
 *  Chúng ta sử dụng vòng while với điều kiện là right < s.length() tức là lặp từ char đầu tiên đến char cuối cùng của s
 *  Trong vòng while:
 *  ** Ta set r = s.charAt(right) tức là r = từng char trong String s, ở đây đầu tiên là 'p'
 *  ** Sau đó ta put r vào trong Map chars, value sẽ là số lần xuất hiện của r, nếu r chưa xuất hiện thì lấy 1
 *  ** Viết tiếp 1 vòng while nữa để check xem số lần r xuất hiện trong chars
 *  ** Nếu số lần xuất hiện lớn hơn 1, thì ta cần:
 *  ** ** Set l = s.charAt(left)
 *  ** ** Sau đó trừ tất cả các số lần xuất hiện của các phần tử trong chars đi 1 cho đến khi char.get(r) = 1
 *  ** ** còn left thì ++
 *  ** Sau khi thực hiện xong vòng while ta lấy giá trị max bằng cách so sánh res với right-left+1(độ dài của mảng dài nhất không lặp lại)
 * ** tăng biến right
 */

import java.util.HashMap;
import java.util.Map;


public class p3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        int p1 = 0;
        int p2 = 0;

        int res = 0;
        while(p2 < s.length()) {
            char r = s.charAt(p2);
            chars.put(r, chars.getOrDefault(r, 0) + 1);
            while(chars.get(r) > 1) {
                char l = s.charAt(p1);
                chars.put(l, chars.get(l) - 1);
                p1++;
            }
            res = Math.max(res, p2-p1 + 1);
            p1++;
        }
        return res;
    }
}
