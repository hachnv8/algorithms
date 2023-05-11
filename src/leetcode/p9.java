package leetcode;
/*
  Created by HachNV on 25/04/2023
 */

/*
  Question:

  Given an integer x, return true if x is apalindrome, and false otherwise.
 */


/**
 * Answer:
 *
 * Đầu tiên chúng ta chuyển số nguyên về String
 *
 * Sau đó sử dụng vòng lặp với nửa đầu chuỗi và kiểm tra xem giá trị tại i và tại s.length()-1-i có bằng nhau không
 * nếu không bằng thì trả về bằng false vì giá trị không đối xứng
 * nếu có thì chạy hết vòng lặp và trả về true
 */
public class p9 {
    public static void main(String[] args) {
        int x = 11211;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
