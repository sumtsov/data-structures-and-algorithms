package com.dsumtsov.dsa.datastructure.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingElementsTest {

    @Test
    public void test() {
        int[] arr1 = {1, 3, 2, 3, 5, 0};
        int res1 = CountingElements.countElements(arr1);

        Assertions.assertEquals(3, res1);

        int[] arr2 = {1, 1, 2, 2};
        int res2 = CountingElements.countElements(arr2);

        Assertions.assertEquals(2, res2);
    }
}
