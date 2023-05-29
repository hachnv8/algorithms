package hackerrank.dsa;

/**
 * Created by HachNV on 26/05/2023
 */
public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static void Fizz(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }

    }
}
