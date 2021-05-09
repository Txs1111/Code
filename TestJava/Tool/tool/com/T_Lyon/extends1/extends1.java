package com.T_Lyon.extends1;

import org.junit.Test;

class extends1 {
    int a = 1;
    float b = 1.1f;

    void show() {
        System.out.println(getClass() + "a:" + a);
        System.out.println(getClass() + "b:" + b);
    }
}

class extends2 extends extends1 {
    int a = 12;
    float b = 1.12f;


    void show() {
        super.show();
        System.out.println(getClass() + "a:" + a);
        System.out.println(getClass() + "b:" + b);
    }
}

class a {

    public static void main(String[] args) {
        aa();
    }

    public static void aa() {
        extends2 extends2 = new extends2();
        extends2.show();
    }
}
