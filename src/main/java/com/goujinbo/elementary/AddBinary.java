package com.goujinbo.elementary;

public class AddBinary {

    public static String addBinary(String a, String b) {
        int i = 1;
        int j = 0;
        StringBuffer s = new StringBuffer();
        while (true) {
            if (i > a.length() && i > b.length())
                if (j == 1) {
                    s.insert(0, 1);
                    break;
                } else
                    break;
            int ac = 0;
            if (i <= a.length()) ac = a.charAt(a.length() - i) == '1' ? 1 : 0;
            int bc = 0;
            if (i <= b.length()) bc = b.charAt(b.length() - i) == '1' ? 1 : 0;
            int sum = ac + bc + j;
            j = sum / 2;
            s.insert(0, sum % 2);
            i++;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
