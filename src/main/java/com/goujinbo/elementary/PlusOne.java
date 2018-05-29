package com.goujinbo.elementary;

/**
 * 加一
 * <p>
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 10 && i != 0) {
                digits[i] = 0;
                digits[i - 1]++;
            } else if (digits[i] == 10 && i == 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            } else
                break;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{7, 9, 9}));
    }

}
