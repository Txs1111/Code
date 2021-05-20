package com.T_Lyon.two;

import java.util.ArrayList;
import java.util.List;

public class Exam1 {

    public static void main(String[] args) {
        Exam1 exam1 = new Exam1();
        //获取每个满足a*a+b*b=c*c的结果
        List<exam> results = exam1.getResults();
        //显示所有结果
        exam1.printResult(results);
    }

    private void printResult(List<exam> results) {
        for (exam result : results) {
            System.out.println(result.toString());
        }
    }

    List<exam> getResults() {
        List<exam> results = new ArrayList<exam>();

        //首先定出c，再定出a, 满足0<a<b<c<101，则时间最短
        for (int c = 1; c * c <= 10000*10000; c++) {
            for (int a = 1; a < c; a++) {
                for (int b = a; b < c; b++) {
                    if (a * a + b * b == c * c) {
                        results.add(new exam(a, b, c));
                    }
                }
            }
        }
        return results;
    }
}
