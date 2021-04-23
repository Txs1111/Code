package com.T_Lyon.System;

import org.junit.Test;

public class system {
    @Test
    public void Demo1() {
        int[] a = {1, 2, 3, 4};
        int[] b = new int[5];
        System.arraycopy(a, 1, b, 0, 2);
        for (int i : b) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : a) {
            System.out.print(i);
        }
    }
    @Test
    public void Demo2() {
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
