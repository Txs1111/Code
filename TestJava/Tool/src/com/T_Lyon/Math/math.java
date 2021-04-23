package com.T_Lyon.Math;

public class math {
    public static void main(String[] args) {
//        double pow (double a, double b) 计算 a 的 b 次方
        double pow = Math.pow(2, 2);
//        double sqrt  (double a)     计算给定值的平方根
        double sqrt = Math.sqrt(9);
//        int abs (int a)     计算 int 类型值 a的绝对值，也接收 long、float 和 double 类型的参数
        int abs = Math.abs(-1);
//        double ceil (double a)  返回大于等于 a的最小整数的double值
        double ceil = Math.ceil(2.2);
//        double floor (double a)     返回小于等于 a的最大整数的double值
        double floor = Math.floor(2.2);
//        int max(int a, int b)   返回 int 型值 a 和 b 中的较大值，也接收 long、float 和 double 类型的参数
        int max = Math.max(1, 2);
//        int min(int a, int b)   返回 a 和 b 中的较小值，也可接收 long、float 和 double 类型的参数
        int min = Math.min(1, 2);
//        int round(float a); 四舍五入返回整数
        long round = Math.round(4.3);
//        double random() 返回带正号的double值，该值大于等于0.0且小于1.0![](随机数)
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
