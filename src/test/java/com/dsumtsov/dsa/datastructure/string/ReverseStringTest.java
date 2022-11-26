package com.dsumtsov.dsa.datastructure.string;

import com.dsumtsov.dsa.datastructure.string.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void test() {
        char[] s = {'c', 'h', 'a', 'r'};
        char[] rev = {'r', 'a', 'h', 'c'};
        ReverseString.reverseString(s);
        Assertions.assertArrayEquals(rev, s);
    }
}
