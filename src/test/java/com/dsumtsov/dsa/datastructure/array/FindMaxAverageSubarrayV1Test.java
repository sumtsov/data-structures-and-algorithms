package com.dsumtsov.dsa.datastructure.array;

import org.junit.jupiter.api.Test;

public class FindMaxAverageSubarrayV1Test {

    @Test
    public void test() {
        int[] nums = {2, 3, 4, 2, 5, 7, 6, 3, 1};
        double maxAvg = FindMaxAverageSubarrayV1.findMaxAverage(nums, 3);
    }
}
