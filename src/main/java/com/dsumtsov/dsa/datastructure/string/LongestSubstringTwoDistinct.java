package com.dsumtsov.dsa.datastructure.string;

import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringTwoDistinct {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        if (n < 3) return n;

        int left = 0;
        int right = 0;
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            map.put(s.charAt(right), right++);
            if (map.size() == 3) {
                int del = Collections.min(map.values());
                map.remove(s.charAt(del));
                left = del + 1;
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
