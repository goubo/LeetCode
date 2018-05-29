package com.goujinbo.elementary;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和 /n
 * <p>
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。/n
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints1 = {2, 7, 11, 15};
        int[] ints = twoSum(ints1, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints1[i]);
        }
    }
}
