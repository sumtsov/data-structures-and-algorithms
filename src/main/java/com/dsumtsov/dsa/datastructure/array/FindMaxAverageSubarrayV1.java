package com.dsumtsov.dsa.datastructure.array;

public class FindMaxAverageSubarrayV1 {

    public static double findMaxAverage(int[] nums, int k) {
        double curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        double ans = curr/k;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i-k];
            double currAns = curr/k;
            if (currAns > ans) {
                ans = currAns;
            }
        }
        return ans;
    }
}
