package com.T_Lyon.equals;

public class equals {
    public equals() {
    }


    public void equals() {

    }

    public static void main(String[] args) {

        //    �Ƚ����������Ƿ����
        Integer integer = new Integer(1);
        Integer integer2 = new Integer(1);
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

}
