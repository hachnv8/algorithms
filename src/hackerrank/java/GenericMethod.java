package hackerrank.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HachNV on 25/05/2023
 */
public class GenericMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] matrizInt = { 1, 2, 3 };
        String[] matrizTexto = { "Hello", "World" };

        printArray(matrizInt);
        printArray(matrizTexto);
    }

    public static <T> T printArray(T[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list[0];
    }
}
