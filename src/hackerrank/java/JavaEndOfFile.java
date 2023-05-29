package hackerrank.java;

import java.util.Scanner;

/**
 * Created by HachNV on 25/05/2023
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int n = 1;
        while(sc.hasNext()) {
            System.out.print(n + " ");
            System.out.print(sc.next());
            System.out.println();
            n++;
        }
        sc.close();
    }
}
