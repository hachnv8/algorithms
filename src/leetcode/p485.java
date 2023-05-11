package leetcode;
/*
  Created by HachNV on 04/05/2023
 */

/** Question
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class p485 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp = 0;
        for (int num : nums) {
            if (num == 1) {
                temp++;
            }
            if (num == 0) {
                if (count < temp) count = temp;
                temp = 0;
            }
        }

        return Math.max(count, temp);
    }
}
