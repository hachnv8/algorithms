package hackerrank.dsa;

import java.util.Scanner;

/**
 * Created by HachNV on 30/05/2023
 */
public class StringRevese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int length = A.length();
        String isPalindrome = "Yes";
        for (int i = 0; i < length/2; i++) {
            if(A.charAt(i) != A.charAt(length-1-i)) {
                isPalindrome = "No";
                break;
            }
        }
        System.out.println(isPalindrome);

    }


}
