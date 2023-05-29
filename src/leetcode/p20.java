package leetcode;

import java.util.Stack;

/**
 * Created by HachNV on 22/05/2023
 */
public class p20 {
    public static void main(String[] args) {
        String s = "}";
        boolean isParentheses = isValid(s);
        System.out.println(isParentheses);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            if(stack.isEmpty()) return false;
            if(s.charAt(i) == ')' && stack.pop() != '(' || s.charAt(i) == ']' && stack.pop() != '[' || s.charAt(i) == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
