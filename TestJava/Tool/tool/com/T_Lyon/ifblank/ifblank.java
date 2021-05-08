package com.T_Lyon.ifblank;

public class ifblank {
    public static void main(String[] args) {
        String blank = " ";
        String other = "sfa";
        System.out.println("空格与空格比较：" + blank.indexOf(" "));
        System.out.println("其他与空格比较：" + other.indexOf(" "));
        System.out.println(blank.indexOf(" ") != -1);
        System.out.println(blank.indexOf(" ") == -1);
        System.out.println(other.indexOf(" ") == 0);
    }
}
