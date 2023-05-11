package leetcode;

/*
  Created by HachNV on 25/04/2023
 */

/*
  Question:
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  <p>
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
  <p>
  You can return the answer in any order.
 */

import java.util.HashMap;
import java.util.Map;

/** Answer:
 * Đầu tiên tạo một mảng res dùng để lưu giá trị index của 2 số tìm được
 *
 * Tiếp theo tạo một hashmap để lưu giá trị của các số trong mảng nums và chỉ số của chúng, điều này giúp chúng ta
 * tìm được một số trong mảng với độ phức tạp là O(1)
 *
 * Tiếp theo với mỗi phần tử `nums[i]` trong mảng nums, kiểm tra xem giá trị target-nums[i] có trong hashmap hay không,
 * nếu có lưu chỉ số của nums[i] vào res[1] và chỉ số của target - nums[i] vào res[0] và trả về res
 * nếu không, thêm giá trị nums[i] và chỉ số của nó vào hashmap
 *
 * Nếu chạy hết code mà không có phần tử nào thỏa mãn thì trả về res với 2 phần tử mặc định là 0
 */
public class p1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4};
        int target = 6;
        int[] res = twoSum(nums, target);
        for (int r : res) {
            System.out.println(r);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = map.get(target - nums[i]);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
