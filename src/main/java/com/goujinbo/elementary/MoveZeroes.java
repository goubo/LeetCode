package com.goujinbo.elementary;

/**
 * 移动零
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0) {
                nums[n] = nums[i];
                n++;
            }
        for (int i = n; i < nums.length; i++)
            nums[i] = 0;

    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12};
        moveZeroes(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
