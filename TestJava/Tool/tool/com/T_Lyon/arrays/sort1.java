package com.T_Lyon.arrays;

import org.junit.Test;

import java.util.Arrays;

public class sort1 {
    @Test
    public void s() {
        String[] str = {"size", "abs", "length", "class"};
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + "   ");
        }
        System.out.println(str[0].toString());
        System.out.println(str.toString());
        System.out.println(Arrays.toString(str));
    }
}
