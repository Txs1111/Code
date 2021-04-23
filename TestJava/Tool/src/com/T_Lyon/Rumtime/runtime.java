package com.T_Lyon.Rumtime;

import org.junit.Test;

import java.io.IOException;

public class runtime {
    @Test
    public void Demo1() {
        Runtime runtime = Runtime.getRuntime();
//        在单独的进程中执行指定的字符串命令
        String s = "";
        try {
            Process exec = runtime.exec(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
