package com.T_Lyon.Random;

import org.junit.Test;

import java.util.Random;
import java.util.stream.DoubleStream;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        DoubleStream doubles = random.doubles(2, 3);
        doubles.limit(10).forEach(System.out::println);
        Random random1 = new Random();
        double v = random1.nextGaussian();
        System.out.println("?nextGaussian?:"+v);
    }
    @Test
    public void Demo(){
        Random rnd = new Random();
        int code = rnd.nextInt(8999) + 1000;
        System.out.println("code:"+code);
    }

    @Test
    public void Demo1(){
        Random r = new Random();
        int nextInt = r.nextInt();
        Random r1 = new Random(10);
        int nextInt2 = r1.nextInt();
        System.out.println("nextInt:"+nextInt);
        System.out.println("nextInt2:"+nextInt2);
    }

    /**
     * ����[0,1.0)�����С��
     *
     */
    @Test
    public void Demo2(){
        Random r = new Random();
        double d1 = r.nextDouble();
        System.out.println("d1:"+d1);
    }

    /**
     * ����[0,5.0)�����С��
     *
     */
    @Test
    public void Demo3(){
        Random r = new Random();
        double d2 = r.nextDouble()* 5;
        System.out.println("d1:"+d2);
    }

    /**
     * ����[1,2.5)�����С��
     *
     */
    @Test
    public void Demo4(){
        Random r = new Random();
        double d3 = r.nextDouble() * 1.5 + 1;
        System.out.println("d1:"+d3);
    }

    /**
     * ������������
     *
     */
    @Test
    public void Demo5(){
        Random r = new Random();
        int n1 = r.nextInt();
        System.out.println("d1:"+n1);
    }

    /**
     * ����[0,10)���������
     *
     */
    @Test
    public void Demo6(){
        Random r = new Random();
        int n2 = r.nextInt(10);
        int n3 = Math.abs(r.nextInt() % 10);
        System.out.println("n2:"+n2);
        System.out.println("n3:"+n3);
    }

    /**
     * ����[0,10]���������
     *
     */
    @Test
    public void Demo7(){
        Random r = new Random();
        int n3 = r.nextInt(11);
        int n4 = Math.abs(r.nextInt() % 11);
        System.out.println("n3:"+n3);
        System.out.println("n4:"+n4);
    }

    /**
     * ����[-3,15)���������
     *
     */
    @Test
    public void Demo8(){
        Random r = new Random();
        int n4 = r.nextInt(18) - 3;
        int n5 = Math.abs(r.nextInt() % 18) - 3;
        System.out.println("n4:"+n4);
        System.out.println("n5:"+n5);
    }
}
