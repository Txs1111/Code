package com.T_Lyon.one;

import org.junit.Test;

import java.util.Random;

public class one {
    final String a_a = "a_a";
    final String a_b = "a_b";
    final String a_c = "a_c";
    final String b_a = "b_a";
    final String b_b = "b_b";
    final String b_c = "b_c";
    final String c_a = "c_a";
    final String c_b = "c_b";
    final String c_c = "c_c";

    @Test
    public void main() {
        /*
        前提：甲乙两车速度未知，
        中间没有车辆停下未知，
        两建筑物大小未知。
         */
        for (int i = 0; i < 20; i++) {
            run();
        }
    }

    public void run() {
        String car1_road = "";
        car1_road = fuzhi(car1_road);
        String car2_road = "";
        car2_road = fuzhi(car2_road);
        if (car1_road == car2_road) {
            System.out.println("会堵车，请绕道，或等待");
        } else {
            System.out.println("========================================");
            System.out.println("car1走" + car1_road);
            System.out.println("car2走" + car2_road);
            System.out.println("========================================");
        }
    }

    public String fuzhi(String road) {
        Random rn = new Random();
        int answer1 = rn.nextInt(10) + 1;
        switch (answer1) {
            case 1:
                road = a_a;
                break;
            case 2:
                road = a_b;
                break;
            case 3:
                road = a_c;
                break;
            case 4:
                road = b_a;
                break;
            case 5:
                road = b_b;
                break;
            case 6:
                road = b_c;
                break;
            case 7:
                road = c_a;
                break;
            case 8:
                road = c_b;
                break;
            case 9:
                road = c_c;
                break;
            case 10:
                fuzhi(road);
                System.out.println("=========调用自己==========");
                break;
        }
        return road;
    }

}
