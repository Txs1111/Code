package com.T_Lyon.two;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class two {
    Set result = new HashSet();
    int x = 0;

    @Test
    public void main() {
        long startTime = System.currentTimeMillis();
//        x();
        m();
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间为：" + (endTime - startTime) + "ms");
        System.out.println(result.toString());
        System.out.println(x);
    }

    public void m() {
        int a = 10000;
        for (int i = 1; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                pd(i, j);
            }
        }
    }

    public void pd(int i, int j) {
        int i1 = i * i + j * j;
        double sqrt = Math.sqrt(i1);
        int s = (int)sqrt;
        if (sqrt <= 10000) {
            if (s == sqrt) {
                x++;
                String a = i + "*" + i + "+" + j + "*" + j + "=" + s + "*" + s;
                result.add(a);
            }
        }
    }

    public int max(int x, int y) {
        if (x > y) {
            return x;
        } else
            return y;
    }

    public void x() {
        int temp_in = 0;
        double temp_bo = 0;
        int res = 0;
        for (int i = 1; i <= 10000; i++) {
            for (int j = i + 1; j <= 10000; j++) {
                res = i * i + j * j;
                temp_bo = (double) Math.sqrt(res);
                temp_in = (int) Math.sqrt(res);
                if (temp_bo - temp_in == 0) {
                    if (temp_in <= 10000) {
//                        x++;
//                        System.out.println(i + "²+" + j + "² = " + temp_in + "²");
                    }
                }
            }

        }
    }
    public class Thread extends Object implements Runnable{
        @Override
        public void run() {

        }
    }
}
