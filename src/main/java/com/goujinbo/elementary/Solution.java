package com.goujinbo.elementary;

/**
 * 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
 * <p>
 * 若可行，输出任意可行的结果。若不可行，返回空字符串。
 *
 * @author BO
 * @date 2020-11-30 15:25
 * @since 2020/11/30
 **/
public class Solution {
    public String reorganizeString(String s) {
        char[] chars = s.toCharArray();
        int[] chars1 = new int[26];
        for (char aChar : chars) {
            chars1[aChar - 'a'] = chars1[aChar - 'a'] + 1;
        }
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == 0) {
                continue;
            }


        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reorganizeString("aab"));
        System.out.println(solution.reorganizeString("aaacb"));
        System.out.println(solution.reorganizeString("asdfewwersdfsewrwerwwerweqqq"));
    }
}
