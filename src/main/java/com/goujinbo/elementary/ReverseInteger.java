package com.goujinbo.elementary;

/**
 * 反转整数
 * <p>
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int r2 = r * 10 + x % 10;
            if (r2 / 10 != r) return 0;
            r = r2;
            x /= 10;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123457));
    }
}
