package hackerrank.java;

import java.util.Scanner;

/**
 * Created by HachNV on 25/05/2023
 */
public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length()+B.length());
        if(A.charAt(0) > B.charAt(0)) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(A.substring(0, 0) + Character.toUpperCase(A.charAt(0))
                + A.substring(1) + " " + B.substring(0, 0) + Character.toUpperCase(B.charAt(0))
                + B.substring(1));
    }
}
