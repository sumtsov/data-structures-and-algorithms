package com.dsumtsov.dsa.datastructure.array;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int currArea;
        while(left < right) {
            int height1 = height[left];
            int height2 = height[right];
            int length = right - left;
            if (height1 > height2) {
                currArea = height2 * length;
                right--;
            } else {
                currArea = height1 * length;
                left++;
            }
            if (currArea > maxArea) {
                maxArea = currArea;
            }
        }
        return maxArea;
    }
}
