package leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by HachNV on 22/05/2023
 */
public class p1544 {
    public static void main(String[] args) {
        String s = "abBAcC";
        String res = makeGood(s);
        System.out.println(res);
    }
    public static String makeGood(String s) {
        StringBuilder greatString = new StringBuilder();
        Deque<Character> deque = new ArrayDeque<>();
        deque.addFirst(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(deque.size() > 0 && Math.abs((int) s.charAt(i) - deque.getFirst()) == 32) {
                deque.pollFirst();
            } else {
                deque.addFirst(s.charAt(i));
            }
        }
        while(!deque.isEmpty()) {
            greatString.append(deque.pollLast());
        }
        return String.valueOf(greatString);
    }
}
