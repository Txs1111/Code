package com.T_Lyon.equals;

import org.junit.Test;

public class equals {
    public equals() {
    }


    public void equals() {

    }

    @Test
    public static void main(String[] args) {

        //    比较两个对象是否相等
        Integer integer = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(integer);
        System.out.println(integer == 1);
        System.out.println(1 == integer);
        System.out.println(integer.equals(1));
        System.out.println(integer == integer2);
        System.out.println(integer.byteValue() == integer2.byteValue());
        System.out.println(integer.equals(integer2));

        int a = 1;
        int b = 1;


        System.out.println(a == b);

        String A = " ";
        String B = " ";
        System.out.println(A == B);
        System.out.println(A.toString() == B.toString());
        System.out.println(A.equals(B));
    }

    public void aa() {

    }

}
