package com.T_Lyon.rectangle;

public class ThreeChengThreeJuZheng {
    public static void main(String[] ages) {
        PrJ();
    }

    public static void PrJ() {
        int[] a = new int[]{1, 23, 1, 41, 1, 19, 1, 12, 1};
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(a[i * j - 1] + "\t");
            }
            System.out.println("");
        }
        int sum = a[1 - 1] + a[5 - 1] + a[9 - 1] + a[1 - 1] + a[5 - 1] + a[7 - 1];
        System.out.println("两条对角线之和为:" + sum);

    }
}
