package leetcode.bfs;

import leetcode.TreeNode;

import java.util.Stack;

/**
 * Created by HachNV on 30/05/2023
 */
public class p112_pathsum {
    public static void main(String[] args) {

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            //list.add(curr.val);
            curr = curr.right;
        }
        return true;
    }
}
