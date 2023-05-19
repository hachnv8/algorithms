package leetcode;

import java.util.Arrays;

/**
 * Created by HachNV on 10/05/2023
 */
public class p414 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1};
        int s = thirdMax(nums);
        System.out.println(s);
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3) {
            return nums[0];
        }
        return nums[nums.length-3];
    }
}
