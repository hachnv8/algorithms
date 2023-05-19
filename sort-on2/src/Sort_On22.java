/**
 * Created by HachNV on 16/05/2023
 */
public class Sort_On22 {
    public static void main(String[] args) {
        int a[] = {5, 3, 2, 7, 8, 1, 2};
//        bubbleSort(a);
        insertionSort(a);
//        selectionSort(a);

    }

    private static void bubbleSort(int[] a) {
        int max = a.length;
        for (int i = 0; i < max - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < max - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    flag = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
            if (flag) {
                break;
            }
            print(i, a);
        }


    }

    private static void insertionSort(int[] a) {
        for (int i = 1, max = a.length, temp = 0; i < max; i++) {


            int posMin = findPosMin(a, i);


            temp = a[posMin];
            a[posMin] = a[i];
            a[i] = temp;


            print(i, a);


        }

    }

    public static int findPosMin(int[] a, int index) {
        int pos = index;
        for (int i = index; i > 0; i--) {
            if (a[i] < a[i - 1]) {
                pos = i;
            }
        }
        return pos;
    }


    private static void selectionSort(int[] a) {
        for (int i = 0, max = a.length, temp = 0; i < max; i++) {
            int posMin = findMin(a, i + 1, max);
            if (posMin != i) {
                temp = a[i];
                a[i] = a[posMin];
                a[posMin] = temp;
            }
            print(i, a);
        }
    }

    public static int findMin(int[] a, int index, int max) {
        int pos = index;
        for (int i = index + 1, min = a[index]; i < max; i++) {
            if (a[i] < min) {
                min = a[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void print(int n, int[] a) {
        System.out.println();
        System.out.print(n + ": ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            char[] sCount = new char[257];
            char[] tCount = new char[257];

            for (int i = 0; i < s.length(); i++) {
                char stoT = s.charAt(i);
                char ttoS = t.charAt(i);
                if (sCount[stoT] == 0 && tCount[ttoS] == 0) {
                    sCount[stoT]= ttoS;
                    tCount[ttoS]=stoT;
                } else if (sCount[stoT] != ttoS) {
                    return false;
                }
            }
            return true;
        }
    }
}
