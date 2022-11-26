package com.dsumtsov.dsa.datastructure.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringTwoDistinctTest {

    @Test
    public void test() {
        String input = "ccaabbb";
        int length = LongestSubstringTwoDistinct.lengthOfLongestSubstringTwoDistinct(input);
        Assertions.assertEquals(5, length);
    }
}
