package com.dsumtsov.dsa.datastructure.hash;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public static int countElements(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();
        for (int x : arr) {
            hashSet.add(x);
        }
        int count = 0;
        for (int x : arr) {
            if (hashSet.contains(x + 1)) {
                count++;
            }
        }
        return count;
    }
}
