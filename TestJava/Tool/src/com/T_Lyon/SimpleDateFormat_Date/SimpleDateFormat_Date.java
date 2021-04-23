package com.T_Lyon.SimpleDateFormat_Date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_Date {
    @Test
    public void Demo1() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss ");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);
    }
}
