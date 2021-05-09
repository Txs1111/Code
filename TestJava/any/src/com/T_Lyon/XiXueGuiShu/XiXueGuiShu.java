package com.T_Lyon.XiXueGuiShu;


import java.util.HashSet;
import java.util.Set;

public class XiXueGuiShu {
    static Set<Integer> integers = new HashSet();

    public static void main(String[] ages) {
        XXG();
        System.out.println(integers);
    }

    private static void XXG() {
        for (int i = 1001; i <= 9999; i++) {
            int a[] = getEvernumber(i);
            int b[] = getXY(a, i);
        }
    }

    private static Set<Integer> pr(int i, int[] b) {
        if (b[0] * b[1] == i) {
//            System.out.println("i:" + i + " sum:" + b[0] + " " + b[1]);
            integers.add(i);
        }
        return integers;
    }

    private static int[] getXY(int[] a, int ii) {
        int[] ints = new int[2];
        int i = 0;
        int j = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (j == i) continue;
                ints[0] = 10 * a[i] + a[j];
//                System.out.println(a[i] + "i" + a[j] + "j" + Arrays.toString(ints));
                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < 4; l++) {
                        if (l == i || l == j || l == k) continue;
                        ints[1] = 10 * a[k] + a[l];
                        pr(ii, ints);
//                        System.out.println("i：" + a[i] + "j：" + a[j] + "k：" + a[k] + "l：" + a[l] + Arrays.toString(ints));
                    }
                }
            }
        }
//        System.out.println();
//        System.out.println(Arrays.toString(ints));
        return ints;
    }

    public static int[] getEvernumber(int i) {
        int[] a = new int[4];
        a[0] = i / 1000;
        a[1] = (i % 1000) / 100;
        a[2] = (i % 100) / 10;
        a[3] = (i % 10) / 1;
//        System.out.println(Arrays.toString(a));
        return a;
    }

}
