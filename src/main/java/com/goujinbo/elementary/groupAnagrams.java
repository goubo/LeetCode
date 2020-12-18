package com.goujinbo.elementary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * @author BO
 * @date 2020-12-14 18:17
 * @since 2020/12/14
 **/
public class groupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.asList(strs).stream().collect(Collectors.groupingBy(s -> s.chars().sorted().collect
                (StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()))
                .values().stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        new groupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

}
