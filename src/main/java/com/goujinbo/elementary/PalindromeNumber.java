package com.goujinbo.elementary;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i = 0, j = s.length() - 1;
        while (i != j && i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(467));
        System.out.println(isPalindrome(464));
    }
}
