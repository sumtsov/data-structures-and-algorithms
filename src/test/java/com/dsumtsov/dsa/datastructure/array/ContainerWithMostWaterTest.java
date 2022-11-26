package com.dsumtsov.dsa.datastructure.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void test() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = ContainerWithMostWater.maxArea(height);
        Assertions.assertEquals(49, maxArea);
    }
}
