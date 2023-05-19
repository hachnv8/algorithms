package leetcode;

/**
 * Created by HachNV on 12/05/2023
 */
public class p283 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        while (p2 < nums.length && nums[p2] == 0) {
            p2++;
            nums[p1] = nums[p2];
            nums[p2] = 0;
            p1++;
        }

    }
}
