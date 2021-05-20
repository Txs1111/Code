package com.T_Lyon.two;

import java.util.ArrayList;
import java.util.List;

public class exam {
    Integer a;
    Integer b;
    Integer c;

    public exam(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    //覆盖用来输出的方法
    public String toString() {
        return "" + a + "*" + a + "+" + b + "*" + b + "=" + c + "*" + c;
    }
}
