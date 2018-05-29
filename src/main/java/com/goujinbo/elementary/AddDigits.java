package com.goujinbo.elementary;

public class AddDigits {
    public static int addDigits(int num) {
        if (num < 10) return num;
        int i = 0;
        while (num != 0) {
            i += num % 10;
            num /= 10;
        }
        return addDigits(i);
    }

    public static void main(String[] args) {
        int num = 193;
        System.out.println(1 + (num - 1) % 9);
        System.out.println(addDigits(num));
    }
}
